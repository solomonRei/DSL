package org.dsl.geometry.processing;

import java.awt.*;
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

  private final boolean isGrid = true;

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
   * Method to draw a grid on the image.
   */
  private void drawGrid() {
    int gridSize = 20; // Размер сетки в пикселях
    g2.setColor(Color.GRAY); // Цвет сетки

    // Рисуем вертикальные линии сетки
    for (int x = 0; x <= Settings.WINDOW_WIDTH; x += gridSize) {
      g2.drawLine(x, 0, x, Settings.WINDOW_HEIGHT);
    }

    // Рисуем горизонтальные линии сетки
    for (int y = 0; y <= Settings.WINDOW_HEIGHT; y += gridSize) {
      g2.drawLine(0, y, Settings.WINDOW_WIDTH, y);
    }
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

    if (isGrid) {
      drawGrid();
    }

    g2.dispose();
    return image;
  }
}
