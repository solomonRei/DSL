package org.dsl.geometry;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.grammar.GeometryBaseListener;
import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.elements.shapes.ShapeFactory;
import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.elements.shapes.impl.Line;
import org.dsl.geometry.processing.elements.shapes.impl.Point;
import org.dsl.geometry.processing.handlers.impl.TriangleHandler;
import org.dsl.geometry.processing.utils.GeometryEvaluator;
import org.dsl.geometry.processing.utils.Utils;

/** Custom listener for parsing geometry language. */
@Slf4j
@Getter
public class CustomListener extends GeometryBaseListener {

  private final List<Drawable> figures = new ArrayList<>();

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

    Point startPoint = Utils.findPointById(startPointId, figures);
    Point endPoint = Utils.findPointById(endPointId, figures);

    if (startPoint != null && endPoint != null) {
      Line line = ShapeFactory.createLine(startPoint, endPoint);
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
    TriangleHandler triangleHandler = new TriangleHandler(figures);
    List<Drawable> triangles = triangleHandler.handle(ctx);
    figures.addAll(triangles);
  }

  @Override
  public void enterCommentStatement(GeometryParser.CommentStatementContext ctx) {
    String commentText = ctx.getText();
    log.info("Найден комментарий: " + commentText);
  }
}
