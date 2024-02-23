package org.dsl.geometry.processing.elements;

import java.awt.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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

  public void draw(Graphics2D g) {
    g.setColor(Color.BLACK);
    g.fillOval((int) (x - 2), (int) (y - 2), 4, 4);
  }
}
