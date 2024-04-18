package org.dsl.geometry.processing.elements.shapes.impl;

import org.dsl.geometry.processing.elements.shapes.Shape;

import java.awt.*;

public class Line implements Shape {
  private final Point start;
  private final Point end;

  public Line(Point start, Point end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public void draw(Graphics2D g) {
    g.setStroke(new BasicStroke(3));
    g.setColor(Color.BLACK);
    g.drawLine((int) start.getX(), (int) start.getY(), (int) end.getX(), (int) end.getY());

    start.draw(g);
    end.draw(g);
    g.setStroke(new BasicStroke(1));
  }
}
