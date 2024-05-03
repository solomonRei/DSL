package org.dsl.geometry.processing.handlers.impl;

import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.elements.shapes.ShapeFactory;
import org.dsl.geometry.processing.elements.shapes.impl.Point;
import org.dsl.geometry.processing.elements.shapes.impl.Triangle;
import org.dsl.geometry.processing.handlers.Handler;
import org.dsl.geometry.processing.utils.GeometryEvaluator;
import org.dsl.geometry.processing.utils.Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Triangle handler.
 */
@Slf4j
public class TriangleHandler implements Handler<GeometryParser.TriangleDeclarationContext> {

    private final Map<String, Drawable> figures;

    private final GeometryEvaluator evaluator = new GeometryEvaluator();

    public TriangleHandler(Map<String, Drawable> figures) {
        this.figures = figures;
    }

    @Override
    public Map<String, Drawable> handle(GeometryParser.TriangleDeclarationContext ctx) {
        Triangle triangle = parseTriangle(ctx);
        String id = ctx.ID().getText();
        if (triangle != null) {
            figures.put(id, triangle);
            log.info("Треугольник создан: {}", triangle);
            addTriangleProperties(ctx, triangle);
        } else {
            log.error("Ошибка при создании треугольника");
        }

        return figures;
    }

    /**
     * Parse triangle.
     *
     * @param ctx triangle context
     * @return triangle
     */
    private Triangle parseTriangle(GeometryParser.TriangleDeclarationContext ctx) {
        if (!ctx.aliasVertex().isEmpty()) {
            return createTriangleWithAliases(ctx);
        } else if (ctx.point().size() == 3) {
            return createTriangleWithPoints(ctx);
        } else if (ctx.EQUILATERAL_TRIANGLE() != null) {
            return createEquilateralTriangle(ctx);
        } else if (ctx.ISOSCELES_TRIANGLE() != null) {
            return createIsoscelesTriangle(ctx);
        } else {
            return createGeneralTriangle(ctx);
        }
    }

    /**
     * Create triangle with aliases.
     *
     * @param ctx triangle context
     * @return triangle
     */
    private Triangle createTriangleWithAliases(GeometryParser.TriangleDeclarationContext ctx) {
        Map<String, Float> aliases = new HashMap<>();
        ctx.aliasVertex()
                .forEach(
                        aliasCtx -> {
                            String alias = aliasCtx.ID().getText();
                            float value = Float.parseFloat(aliasCtx.expression().NUM().getText());
                            aliases.put(alias, value);
                        });
        return ShapeFactory.createTriangleWithAliases(aliases);
    }

    /**
     * Create triangle with points.
     *
     * @param ctx triangle context
     * @return triangle
     */
    private Triangle createTriangleWithPoints(GeometryParser.TriangleDeclarationContext ctx) {
        Point p1 = Utils.findPointById(ctx.point(0).ID().getText(), figures);
        Point p2 = Utils.findPointById(ctx.point(1).ID().getText(), figures);
        Point p3 = Utils.findPointById(ctx.point(2).ID().getText(), figures);
        if (p1 != null && p2 != null && p3 != null) {
            return ShapeFactory.createTriangle(p1, p2, p3);
        }
        return null;
    }

    /**
     * Create equilateral triangle.
     *
     * @param ctx triangle context
     * @return triangle
     */
    private Triangle createEquilateralTriangle(GeometryParser.TriangleDeclarationContext ctx) {
        double side = evaluator.visit(ctx.expression(0));
        return ShapeFactory.createEquilateralTriangle(side);
    }

    /**
     * Create isosceles triangle.
     *
     * @param ctx triangle context
     * @return triangle
     */
    private Triangle createIsoscelesTriangle(GeometryParser.TriangleDeclarationContext ctx) {
        double base = evaluator.visit(ctx.expression(0));
        double leg = evaluator.visit(ctx.expression(1));
        return ShapeFactory.createIsoscelesTriangle(base, leg);
    }

    /**
     * Create general triangle.
     *
     * @param ctx triangle context
     * @return triangle
     */
    private Triangle createGeneralTriangle(GeometryParser.TriangleDeclarationContext ctx) {
        double side1 = evaluator.visit(ctx.expression(0));
        double side2 = evaluator.visit(ctx.expression(1));
        double side3 = evaluator.visit(ctx.expression(2));
        return ShapeFactory.createTriangle(side1, side2, side3);
    }

    /**
     * Add triangle properties.
     *
     * @param ctx      triangle context
     * @param triangle triangle
     */
    private void addTriangleProperties(
            GeometryParser.TriangleDeclarationContext ctx, Triangle triangle) {
        ctx.triangleProperty()
                .forEach(
                        property -> {
                            if (property.bisectorDeclaration() != null) {
                                addBisector(triangle, property.bisectorDeclaration());
                            }
                            if (property.angleDeclaration() != null) {
                                addAngle(triangle, property.angleDeclaration());
                            }
                        });
    }

    /**
     * Add bisector to triangle.
     *
     * @param triangle    triangle
     * @param bisectorCtx bisector context
     */
    private void addBisector(
            Triangle triangle, GeometryParser.BisectorDeclarationContext bisectorCtx) {
        String vertexId = bisectorCtx.ID().getText();
        triangle.addBisectorFromVertex(vertexId);
        log.info("Добавлена биссектриса для вершины: " + vertexId);
    }

    /**
     * Add angle to triangle.
     *
     * @param triangle triangle
     * @param angleCtx angle context
     */
    private void addAngle(Triangle triangle, GeometryParser.AngleDeclarationContext angleCtx) {
        String vertexId = angleCtx.ID().getText();
        double angle = Double.parseDouble(angleCtx.expression().NUM().getText());
        triangle.setAngleAtVertex(vertexId, angle);
        log.info("Установлен угол " + angle + " для вершины: " + vertexId);
    }
}
