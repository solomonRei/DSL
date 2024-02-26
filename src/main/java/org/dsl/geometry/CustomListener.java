package org.dsl.geometry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.grammar.GeometryBaseListener;
import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.FigureFactory;
import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.elements.impl.Line;
import org.dsl.geometry.processing.elements.impl.Point;
import org.dsl.geometry.processing.elements.impl.Triangle;

/** Custom listener for parsing geometry language. */
@Slf4j
@Getter
public class CustomListener extends GeometryBaseListener {

  private final List<Drawable> figures = new ArrayList<>();

  /**
   * Method for entering point declaration.
   *
   * @param ctx context
   */
  @Override
  public void enterPointDeclaration(GeometryParser.PointDeclarationContext ctx) {
    float x = Float.parseFloat(ctx.NUM(0).getText());
    float y = Float.parseFloat(ctx.NUM(1).getText());
    String id = ctx.ID().getText();

    Point point = FigureFactory.createPoint(x, y, id);
    figures.add(point);

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

    Point startPoint = findPointById(startPointId);
    Point endPoint = findPointById(endPointId);

    if (startPoint != null && endPoint != null) {
      Line line = FigureFactory.createLine(startPoint, endPoint);
      figures.add(line);

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
    Map<String, Float> aliases = new HashMap<>();
    Triangle triangle;

    if (!ctx.aliasVertex().isEmpty()) {
      ctx.aliasVertex()
          .forEach(
              aliasCtx -> {
                String alias = aliasCtx.ID().getText();
                float value = Float.parseFloat(aliasCtx.NUM().getText());
                aliases.put(alias, value);
              });
      triangle = FigureFactory.createTriangleWithAliases(aliases);
    } else if (ctx.point().size() == 3) {
      Point p1 = findPointById(ctx.point(0).ID().getText());
      Point p2 = findPointById(ctx.point(1).ID().getText());
      Point p3 = findPointById(ctx.point(2).ID().getText());
      if (p1 != null && p2 != null && p3 != null) {
        triangle = FigureFactory.createTriangle(p1, p2, p3);
      } else {
        triangle = null;
      }
    } else if (ctx.EQUILATERAL_TRIANGLE() != null) {
      double side = Double.parseDouble(ctx.NUM(0).getText());
      triangle = FigureFactory.createEquilateralTriangle(side);
    } else if (ctx.ISOSCELES_TRIANGLE() != null) {
      double base = Double.parseDouble(ctx.NUM(0).getText());
      double leg = Double.parseDouble(ctx.NUM(1).getText());
      triangle = FigureFactory.createIsoscelesTriangle(base, leg);
    } else {
      double side1 = Double.parseDouble(ctx.NUM(0).getText());
      double side2 = Double.parseDouble(ctx.NUM(1).getText());
      double side3 = Double.parseDouble(ctx.NUM(2).getText());
      triangle = new Triangle(side1, side2, side3);
    }

    if (triangle != null) {
      figures.add(triangle);
      log.info("Добавлен треугольник");

      ctx.triangleProperty()
          .forEach(
              property -> {
                if (property.bisectorDeclaration() != null) {
                  String vertexId = property.bisectorDeclaration().ID().getText();
                  triangle.addBisectorFromVertex(vertexId);
                  log.info("Добавлена биссектриса из вершины: " + vertexId);
                }
                if (property.angleDeclaration() != null) {
                  String vertexId = property.angleDeclaration().ID().getText();
                  double angle = Double.parseDouble(property.angleDeclaration().NUM().getText());
                  triangle.setAngleAtVertex(vertexId, angle);
                  log.info("Установлен угол " + angle + " для вершины: " + vertexId);
                }
              });
    } else {
      log.error("Не удалось создать треугольник");
    }
  }

  @Override
  public void enterCommentStatement(GeometryParser.CommentStatementContext ctx) {
    String commentText = ctx.getText();
    log.info("Найден комментарий: " + commentText);
  }

  /**
   * Method for finding point by id.
   *
   * @param id id
   * @return point
   */
  private Point findPointById(String id) {
    for (Drawable figure : figures) {
      if (figure instanceof Point) {
        Point point = (Point) figure;
        if (point.getId().equals(id)) {
          return point;
        }
      }
    }
    log.error("Точка с идентификатором " + id + " не найдена.");
    return null;
  }
}
