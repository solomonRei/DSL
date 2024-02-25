package org.dsl.geometry.processing;

import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.elements.impl.Line;
import org.dsl.geometry.processing.elements.impl.Point;
import org.dsl.geometry.processing.elements.impl.Triangle;

/** Factory for creating figures. */
public class FigureFactory {

  private FigureFactory() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Method for creating point.
   *
   * @param x x coordinate
   * @param y y coordinate
   * @param id id
   * @return point
   */
  public static Point createPoint(float x, float y, String id) {
    return new Point(x, y, id);
  }

  /**
   * Method for creating line.
   *
   * @param start start point
   * @param end end point
   * @return line
   */
  public static Line createLine(Point start, Point end) {
    return new Line(start, end);
  }

  /**
   * Method for creating triangle.
   *
   * @param p1 first point
   * @param p2 second point
   * @param p3 third point
   * @return triangle
   */
  public static Triangle createTriangle(Point p1, Point p2, Point p3) {
    return new Triangle(p1, p2, p3);
  }

  /**
   * Method for creating triangle.
   *
   * @param side1 first side
   * @param side2 second side
   * @param side3 third side
   * @return triangle
   */
  public static Drawable createTriangle(double side1, double side2, double side3) {
    return new Triangle(side1, side2, side3);
  }
}
