package org.dsl.geometry.processing.elements.shapes.impl;

import java.awt.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.dsl.geometry.processing.elements.shapes.Shape;
import org.dsl.geometry.processing.utils.Settings;

@Getter
@Setter
@ToString
public class Point implements Shape {
  private float x;
  private float y;
  private String id;

  public Point(float x, float y, String id) {
    this.x = x;
    this.y = y;
    this.id = id;
  }

  @Override
  public void draw(Graphics2D g) {
    g.setColor(Color.BLACK);
    g.fillOval((int) (x - 2), (int) (y - 2), 4, 4);

    if (Settings.SHOW_NAME_OF_VERTICES) {
      g.drawString(id, x + 5, y - 5);
    }
  }
}
