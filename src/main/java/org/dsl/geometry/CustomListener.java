package org.dsl.geometry;

import java.util.ArrayList;
import java.util.List;
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

    Point point = new Point(x, y, id);
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
      Line line = new Line(startPoint, endPoint);
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
    if (ctx.point().size() == 3) {
      handleTriangleDefinedByPoints(ctx);
    } else if (ctx.EQUILATERAL_TRIANGLE() != null) {
      double side = Double.parseDouble(ctx.NUM(0).getText());
      Triangle triangle = FigureFactory.createEquilateralTriangle(side);
      figures.add(triangle);
      log.info("Добавлен равносторонний треугольник: {}", triangle);
    } else if (ctx.ISOSCELES_TRIANGLE() != null) {
      double base = Double.parseDouble(ctx.NUM(0).getText());
      double leg = Double.parseDouble(ctx.NUM(1).getText());
      Triangle triangle = FigureFactory.createIsoscelesTriangle(base, leg);
      figures.add(triangle);
      log.info("Добавлен равнобедренный треугольник: {}", triangle);
    } else {
      double side1 = Double.parseDouble(ctx.NUM(0).getText());
      double side2 = Double.parseDouble(ctx.NUM(1).getText());
      double side3 = Double.parseDouble(ctx.NUM(2).getText());
      Triangle triangle = new Triangle(side1, side2, side3);
      if (triangle.isValidTriangle()) {
        figures.add(triangle);
        log.info("Добавлен треугольник с заданными сторонами: {}", triangle);
      } else {
        log.error("Невозможно создать треугольник с заданными сторонами.");
      }
    }
  }

  private void handleTriangleDefinedByPoints(GeometryParser.TriangleDeclarationContext ctx) {
    Point p1 = findPointById(ctx.point(0).ID().getText());
    Point p2 = findPointById(ctx.point(1).ID().getText());
    Point p3 = findPointById(ctx.point(2).ID().getText());
    if (p1 != null && p2 != null && p3 != null) {
      Triangle triangle = new Triangle(p1, p2, p3);
      figures.add(triangle);
      log.info("Добавлен треугольник через точки: {}", triangle);
    } else {
      log.error("Одна из точек для треугольника не найдена.");
    }
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
