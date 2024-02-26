package org.dsl.geometry.processing.elements.impl;

import org.dsl.geometry.processing.elements.Drawable;

import java.awt.*;

public class Line implements Drawable {
  private final Point start;
  private final Point end;

  public Line(Point start, Point end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public void draw(Graphics2D g) {
    g.setColor(Color.BLACK);
    g.drawLine(
        (int) start.getX(),
        (int) start.getY(),
        (int) end.getX(),
        (int) end.getY());

    start.draw(g);
    end.draw(g);
  }
}
