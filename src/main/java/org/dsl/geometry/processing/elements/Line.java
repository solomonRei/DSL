package org.dsl.geometry.processing.elements;

import java.awt.*;

public class Line {
  private final Point start;
  private final Point end;

  public Line(Point start, Point end) {
    this.start = start;
    this.end = end;
  }

  public void draw(Graphics2D g) {
    g.setColor(Color.BLACK);
    g.drawLine(
        (int) start.getX(),
        (int) start.getY(),
        (int) end.getX(),
        (int) end.getY()); // Пример рисования линии
  }
}
