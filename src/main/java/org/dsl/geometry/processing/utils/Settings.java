package org.dsl.geometry.processing.utils;

import java.awt.*;

/** Settings class for the application */
public class Settings {

  private Settings() {
    throw new IllegalStateException("Utility class");
  }

  /** The height of the window */
  public static final int WINDOW_HEIGHT = 600;

  /** The width of the window */
  public static final int WINDOW_WIDTH = 800;

  /** The initial coordinate of the window */
  public static final int INITIAL_COORDINATE_X = 20;

  /** The initial coordinate of the window */
  public static final int INITIAL_COORDINATE_Y = 20;

  /** The padding of the window */
  public static final int WINDOW_PADDING = 10;

  /** The color of the lines */
  public static final Color BACKGROUND_COLOR = Color.white;

  /** Show the name of the vertices */
  public static final boolean SHOW_NAME_OF_VERTICES = true;
}
