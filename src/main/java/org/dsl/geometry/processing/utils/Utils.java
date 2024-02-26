package org.dsl.geometry.processing.utils;

import java.util.UUID;
import org.dsl.geometry.processing.elements.impl.Point;

public class Utils {
  private static final int INITIAL_COORDINATE_X = 20;
  private static final int INITIAL_COORDINATE_Y = 20;

  private Utils() {
    throw new IllegalStateException("Utility class");
  }

  /**
   * Generate random id.
   *
   * @return random id
   */
  public static String generateRandomId() {
    return UUID.randomUUID().toString().substring(0, 4);
  }

  /**
   * Calculate distance between two points.
   *
   * @param p1 first point
   * @param p2 second point
   * @return distance
   */
  public static double calculateDistance(final Point p1, final Point p2) {
    return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
  }

  /**
   * Get initial coordinate x.
   *
   * @return initial coordinate x
   */
  public static int getInitialCoordinateX() {
    return INITIAL_COORDINATE_X;
  }

  /**
   * Get initial coordinate y.
   *
   * @return initial coordinate y
   */
  public static int getInitialCoordinateY() {
    return INITIAL_COORDINATE_Y;
  }
}
