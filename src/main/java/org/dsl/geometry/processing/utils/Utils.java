package org.dsl.geometry.processing.utils;

import java.util.List;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.elements.shapes.impl.Point;

@Slf4j
public class Utils {

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
   * Method for finding point by id.
   *
   * @param id id
   * @return point
   */
  public static Point findPointById(String id, List<Drawable> figures) {
    for (Drawable figure : figures) {
      if (figure instanceof Point) {
        Point point = (Point) figure;
        if (point.getId().equals(id)) {
          return point;
        }
      }
    }
    log.error("Точка с идентификатором " + id + " не найдена.");
    return null;
  }
}
