package org.dsl.geometry.processing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.dsl.geometry.processing.elements.Drawable;

/** GeometrySketchHeadless class. */
@Getter
@Setter
public class GeometrySketchHeadless {
  private List<Drawable> figures;

  /**
   * Method to create an image.
   *
   * @return BufferedImage
   */
  public BufferedImage createImage() {
    int width = 800;
    int height = 600;
    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    Graphics2D g2 = image.createGraphics();

    g2.setColor(Color.WHITE);
    g2.fillRect(0, 0, width, height);

    for (Drawable obj : figures) {
      obj.draw(g2);
    }

    g2.dispose();
    return image;
  }
}
