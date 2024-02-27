package org.dsl.geometry.processing.elements.shapes;

import java.util.Iterator;
import java.util.Map;
import org.dsl.geometry.processing.elements.shapes.impl.Line;
import org.dsl.geometry.processing.elements.shapes.impl.Point;
import org.dsl.geometry.processing.elements.shapes.impl.Triangle;
import org.dsl.geometry.processing.utils.Settings;

/** Factory for creating figures. */
public class ShapeFactory {

  private ShapeFactory() {
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
  public static Triangle createTriangle(double side1, double side2, double side3) {
    return new Triangle(side1, side2, side3);
  }

  /**
   * Method for creating equilateral triangle.
   *
   * @param side side
   * @return triangle
   */
  public static Triangle createEquilateralTriangle(double side) {
    return new Triangle(side, true);
  }

  /**
   * Method for creating isosceles triangle.
   *
   * @param base base
   * @param leg leg
   * @return triangle
   */
  public static Triangle createIsoscelesTriangle(double base, double leg) {
    return new Triangle(base, leg);
  }

  /**
   * Method for creating triangles with aliases.
   * @param sides sides
   * @return triangle
   */
  public static Triangle createTriangleWithAliases(Map<String, Float> sides) {
    if (sides.size() < 3) {
      throw new IllegalArgumentException("For creating triangles is required 3 sides.");
    }

    Iterator<Map.Entry<String, Float>> sideEntries = sides.entrySet().iterator();

    Map.Entry<String, Float> side1Entry = sideEntries.next();
    Map.Entry<String, Float> side2Entry = sideEntries.next();
    Map.Entry<String, Float> side3Entry = sideEntries.next();

    Point p1 = new Point(Settings.INITIAL_COORDINATE_X, Settings.INITIAL_COORDINATE_Y, side1Entry.getKey());
    Point p2 = new Point(side1Entry.getValue(), Settings.INITIAL_COORDINATE_Y, side2Entry.getKey());
    float height = (float)Math.sqrt(side2Entry.getValue() * side2Entry.getValue() - side1Entry.getValue() * side1Entry.getValue());
    Point p3 = new Point(Settings.INITIAL_COORDINATE_X, height, side3Entry.getKey());

    return new Triangle(p1, p2, p3);
  }
}
