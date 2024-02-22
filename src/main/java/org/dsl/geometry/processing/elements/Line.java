package org.dsl.geometry.processing.elements;

import processing.core.PApplet;

public class Line {
  private final Point start;
  private final Point end;

  public Line(Point start, Point end) {
    this.start = start;
    this.end = end;
  }

  public void draw(PApplet p) {
    p.line(start.getX(), start.getY(), end.getX(), end.getY());
  }
}
