package org.dsl.geometry.processing.elements.impl;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.utils.Utils;

@Slf4j
@Getter
@Setter
@ToString
public class Triangle implements Drawable {
  private double side1;
  private double side2;
  private double side3;
  private Point p1;
  private Point p2;
  private Point p3;
  private Map<String, Point> vertices = new HashMap<>();
  private List<Bisector> bisectors = new ArrayList<>();

  public Triangle(final double side1, final double side2, final double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.p1 = new Point(Utils.getInitialCoordinateX(), Utils.getInitialCoordinateY(), Utils.generateRandomId());
    this.p2 = new Point((float) side1, Utils.getInitialCoordinateX(), Utils.generateRandomId());
    this.p3 =
        new Point(Utils.getInitialCoordinateX(), (float) Math.sqrt(side2 * side2 - side1 * side1), Utils.generateRandomId());
    fillVerticesMap();
  }

  public Triangle(final Point p1, final Point p2, final Point p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.side1 = Utils.calculateDistance(p1, p2);
    this.side2 = Utils.calculateDistance(p2, p3);
    this.side3 = Utils.calculateDistance(p3, p1);
    fillVerticesMap();
  }

  public Triangle(final double side, final boolean isEquilateral) {
    if (isEquilateral) {
      this.p1 = new Point(Utils.getInitialCoordinateX(), Utils.getInitialCoordinateY(), Utils.generateRandomId());
      this.p2 = new Point((float) side, Utils.getInitialCoordinateY(), Utils.generateRandomId());
      this.p3 =
          new Point(
              (float) (side / 2), (float) (side * Math.sqrt(3) / 2), Utils.generateRandomId());
      fillVerticesMap();
    }
  }

  public Triangle(final double base, final double leg) {
    double h = Math.sqrt(leg * leg - (base / 2) * (base / 2));
    this.p1 = new Point(Utils.getInitialCoordinateX(), Utils.getInitialCoordinateY(), Utils.generateRandomId());
    this.p2 = new Point((float) base, Utils.getInitialCoordinateY(), Utils.generateRandomId());
    this.p3 = new Point((float) (base / 2), (float) h, Utils.generateRandomId());
    fillVerticesMap();
  }

  public boolean isValidTriangle() {
    return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
  }

  public void addBisectorFromVertex(String vertexId) {
    Point startPoint = vertices.get(vertexId);
    if (startPoint == null) {
      log.error("Ошибка: вершина с идентификатором " + vertexId + " не найдена.");
      return;
    }

    List<Point> otherPoints =
        vertices.values().stream()
            .filter(p -> !p.getId().equals(vertexId))
            .collect(Collectors.toList());

    if (otherPoints.size() != 2) {
      log.error("Ошибка: неверное количество вершин для построения биссектрисы.");
      return;
    }

    Point midPoint =
        new Point(
            (otherPoints.get(0).getX() + otherPoints.get(1).getX()) / 2,
            (otherPoints.get(0).getY() + otherPoints.get(1).getY()) / 2,
            Utils.generateRandomId());

    bisectors.add(new Bisector(startPoint, midPoint));
  }

  public void setAngleAtVertex(String vertexId, double angle) {
    log.info("Угол у вершины " + vertexId + " был изменен на: " + angle + " градусов");
  }

  @Override
  public void draw(final Graphics2D g) {
    new Line(p1, p2).draw(g);
    new Line(p2, p3).draw(g);
    new Line(p3, p1).draw(g);

    bisectors.forEach(bisector -> bisector.draw(g));
  }

  private void fillVerticesMap() {
    vertices.put(p1.getId(), p1);
    vertices.put(p2.getId(), p2);
    vertices.put(p3.getId(), p3);
  }
}
