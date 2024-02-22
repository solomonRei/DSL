package org.dsl.geometry.processing;

import java.util.List;
import lombok.Setter;
import org.dsl.geometry.processing.elements.Line;
import org.dsl.geometry.processing.elements.Point;
import processing.core.PApplet;

@Setter
public class GeometrySketch extends PApplet {
  private List<Object> figures;

  public void settings() {
    size(800, 600);
  }

  public void setup() {
    background(255);
  }

  public void draw() {
    for (Object obj : figures) {
      if (obj instanceof Point) {
        ((Point) obj).draw(this);
      } else if (obj instanceof Line) {
        ((Line) obj).draw(this);
      }
    }
  }

  public void runSketch() {
    String[] processingArgs = {"GeometrySketch"};
    PApplet.runSketch(processingArgs, this);
  }

  public static void main(String[] args) {
    PApplet.main("org.dsl.geometry.processing.GeometrySketch");
  }
}
