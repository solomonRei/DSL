package org.dsl.geometry.processing.elements;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import processing.core.PApplet;

@Getter
@Setter
@ToString
public class Point {
  private float x;
  private float y;
  private String id;

  public Point(float x, float y, String id) {
    this.x = x;
    this.y = y;
    this.id = id;
  }

  public void draw(PApplet p) {
    p.ellipse(x, y, 5, 5);
  }
}
