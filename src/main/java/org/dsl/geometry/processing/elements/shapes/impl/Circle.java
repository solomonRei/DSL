package org.dsl.geometry.processing.elements.shapes.impl;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.processing.elements.shapes.Shape;
import org.dsl.geometry.processing.utils.Settings;

import java.awt.*;

@Slf4j
@Getter
@Setter
@ToString
public class Circle implements Shape {

    private double radius;

    private Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void draw(Graphics2D g) {
        if (g != null && center != null) {
            g.setStroke(new BasicStroke(3));
            g.setColor(Color.BLACK);
            int x = (int) (center.getX() - radius);
            int y = (int) (center.getY() - radius);
            int diameter = (int) (2 * radius);
            g.drawOval(x, y, diameter, diameter);
            log.info("Drawing circle at (" + center.getX() + ", " + center.getY() + ") with radius " + radius);
            g.setStroke(new BasicStroke(1));
        }
    }

    public void scaleCircle() {
        this.radius *= Settings.scale;

        this.center.setX((int)(this.center.getX() * Settings.scale + Settings.INITIAL_COORDINATE_X));
        this.center.setY((int)(this.center.getY() * Settings.scale + Settings.INITIAL_COORDINATE_Y));

        log.info("Scaled circle to new radius {} and center ({}, {})", radius, center.getX(), center.getY());
    }
}
