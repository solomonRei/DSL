package org.dsl.geometry;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.grammar.GeometryBaseListener;
import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.elements.Line;
import org.dsl.geometry.processing.elements.Point;

/** Custom listener for parsing geometry language. */
@Slf4j
@Getter
public class CustomListener extends GeometryBaseListener {

  private final List<Object> figures = new ArrayList<>();

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

    log.info("Добавлена точка: " + point + " с идентификатором " + id);
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
   * Method for finding point by id.
   *
   * @param id id
   * @return point
   */
  private Point findPointById(String id) {
    for (Object figure : figures) {
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
