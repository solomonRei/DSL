package org.dsl.geometry.processing.elements.properties.impl;

import java.awt.Graphics2D;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.dsl.geometry.processing.elements.properties.Property;
import org.dsl.geometry.processing.elements.shapes.impl.Point;

/** Class for bisector. */
@Getter
@Setter
@ToString
public class Bisector implements Property {
  private final Point startPoint;
  private final Point midPoint;

  public Bisector(final Point startPoint, final Point midPoint) {
    this.startPoint = startPoint;
    this.midPoint = midPoint;
  }

  @Override
  public void draw(final Graphics2D g) {
    if (startPoint != null && midPoint != null) {
      g.drawLine(
          (int) startPoint.getX(),
          (int) startPoint.getY(),
          (int) midPoint.getX(),
          (int) midPoint.getY());
    }
  }
}
