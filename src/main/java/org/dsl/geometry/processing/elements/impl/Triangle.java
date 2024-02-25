package org.dsl.geometry.processing.elements.impl;

import java.awt.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.utils.Utils;

@Getter
@Setter
@ToString
public class Triangle implements Drawable {
  private final double side1;
  private final double side2;
  private final double side3;
  private Point p1;
  private Point p2;
  private Point p3;

  public Triangle(final double side1, final double side2, final double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.p1 = new Point(0, 0, Utils.generateRandomId());
    this.p2 = new Point((float) side1, 0, Utils.generateRandomId());
    this.p3 =
        new Point(0, (float) Math.sqrt(side2 * side2 - side1 * side1), Utils.generateRandomId());
  }

  public Triangle(final Point p1, final Point p2, final Point p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.side1 = Utils.calculateDistance(p1, p2);
    this.side2 = Utils.calculateDistance(p2, p3);
    this.side3 = Utils.calculateDistance(p3, p1);
  }

  public boolean isValidTriangle() {
    return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
  }

  @Override
  public void draw(final Graphics2D g) {
    new Line(p1, p2).draw(g);
    new Line(p2, p3).draw(g);
    new Line(p3, p1).draw(g);
  }
}
