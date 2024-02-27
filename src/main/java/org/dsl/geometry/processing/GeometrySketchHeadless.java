package org.dsl.geometry.processing;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.utils.Settings;

/** GeometrySketchHeadless class. */
@Getter
@Setter
public class GeometrySketchHeadless {
  private final List<Drawable> figures;

  private final BufferedImage image;

  private final Graphics2D g2;

  public GeometrySketchHeadless(List<Drawable> figures) {
    this.figures = figures;
    this.image =
        new BufferedImage(
            Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT, BufferedImage.TYPE_INT_RGB);
    this.g2 = image.createGraphics();
    this.g2.setColor(Settings.BACKGROUND_COLOR);
    this.g2.fillRect(0, 0, Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
  }

  /**
   * Method to create an image.
   *
   * @return BufferedImage
   */
  public BufferedImage outputFigures() {

    for (Drawable obj : figures) {
      obj.draw(g2);
    }

    g2.dispose();
    return image;
  }
}
