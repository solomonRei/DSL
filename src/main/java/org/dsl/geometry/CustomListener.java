package org.dsl.geometry;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.grammar.GeometryBaseListener;
import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.elements.shapes.ShapeFactory;
import org.dsl.geometry.processing.elements.shapes.impl.Circle;
import org.dsl.geometry.processing.elements.shapes.impl.Line;
import org.dsl.geometry.processing.elements.shapes.impl.Point;
import org.dsl.geometry.processing.elements.shapes.impl.Triangle;
import org.dsl.geometry.processing.handlers.impl.CircleHandler;
import org.dsl.geometry.processing.handlers.impl.SquareHandler;
import org.dsl.geometry.processing.handlers.impl.TriangleHandler;
import org.dsl.geometry.processing.utils.GeometryEvaluator;
import org.dsl.geometry.processing.utils.Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Custom listener for parsing geometry language.
 */
@Slf4j
@Getter
public class CustomListener extends GeometryBaseListener {

    private final Map<String, Drawable> figures = new HashMap<>();

    private final GeometryEvaluator evaluator = new GeometryEvaluator();

    /**
     * Method for entering point declaration.
     *
     * @param ctx context
     */
    @Override
    public void enterPointDeclaration(GeometryParser.PointDeclarationContext ctx) {
        float x = Float.parseFloat(String.valueOf(evaluator.visit(ctx.expression(0))));
        float y = Float.parseFloat(String.valueOf(evaluator.visit(ctx.expression(1))));
        String id = ctx.ID().getText();

        Point point = ShapeFactory.createPoint(x, y, id);
        figures.put(id, point);

        log.info("Добавлена точка: {} с идентификатором {}", point, id);
    }

    /**
     * Method for entering line declaration.
     *
     * @param ctx context
     */
    @Override
    public void enterLineDeclaration(GeometryParser.LineDeclarationContext ctx) {
        String startPointId = ctx.point(0).ID().getText();
        String endPointId = ctx.point(1).ID().getText();

        Point startPoint = Utils.findPointById(startPointId, figures);
        Point endPoint = Utils.findPointById(endPointId, figures);

        if (startPoint != null && endPoint != null) {
            Line line = ShapeFactory.createLine(startPoint, endPoint);
            String id = ctx.ID().getText();
            figures.put(id, line);

            log.info("Добавлена линия: " + line);
        } else {
            log.error("Одна из точек для линии не найдена.");
        }
    }

    /**
     * Method for entering triangle declaration.
     *
     * @param ctx context
     */
    @Override
    public void enterTriangleDeclaration(GeometryParser.TriangleDeclarationContext ctx) {
        TriangleHandler triangleHandler = new TriangleHandler(figures);
        Map<String, Drawable> triangles = triangleHandler.handle(ctx);
        figures.putAll(triangles);
    }

    /**
     * Method for entering circle declaration.
     *
     * @param ctx context
     */
    @Override
    public void enterCircleDeclaration(GeometryParser.CircleDeclarationContext ctx) {
        CircleHandler circleHandler = new CircleHandler(figures);
        Map<String, Drawable> circles = circleHandler.handle(ctx);
        figures.putAll(circles);
    }

    /**
     * Method for entering square declaration.
     *
     * @param ctx context
     */
    @Override
    public void enterSquareDeclaration(GeometryParser.SquareDeclarationContext ctx) {
        SquareHandler squareHandler = new SquareHandler(figures);
        Map<String, Drawable> squares = squareHandler.handle(ctx);
        figures.putAll(squares);
    }

    /**
     * Method for entering function call.
     *
     * @param ctx context
     */
    @Override
    public void enterFunctionCall(GeometryParser.FunctionCallContext ctx) {
        String shapeId = ctx.ID().getText();
        Drawable shape = figures.get(shapeId);
        if (shape == null) {
            log.error("Фигура с ID {} не найдена.", shapeId);
            return;
        }

        GeometryParser.FunctionDeclarationContext function = ctx.functionDeclaration();
        handleFunction(shape, function);
    }

    private void handleFunction(Drawable shape, GeometryParser.FunctionDeclarationContext ctx) {
        if ("area".equals(ctx.getStart().getText())) {
            if (shape instanceof Circle) {
                double area = ((Circle) shape).calculateArea();
                log.info("Площадь круга {}: {}", shape, area);
            } else if (shape instanceof Triangle) {
                double area = ((Triangle) shape).calculateArea();
                log.info("Площадь треугольника {}: {}", shape, area);
            }
        } else if ("perimeter".equals(ctx.getStart().getText())) {
            if (shape instanceof Circle) {
                double perimeter = ((Circle) shape).calculatePerimeter();
                log.info("Периметр круга {}: {}", shape, perimeter);
            } else if (shape instanceof Triangle) {
                double perimeter = ((Triangle) shape).calculatePerimeter();
                log.info("Периметр треугольника {}: {}", shape, perimeter);
            }
        }
    }


    /**
     * Method for entering comment statement.
     *
     * @param ctx context
     */
    @Override
    public void enterCommentStatement(GeometryParser.CommentStatementContext ctx) {
        String commentText = ctx.getText();
        log.info("Найден комментарий: " + commentText);
    }
}
