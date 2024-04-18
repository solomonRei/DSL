package org.dsl.geometry.processing.elements.shapes.impl;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.processing.elements.properties.impl.Bisector;
import org.dsl.geometry.processing.utils.Settings;
import org.dsl.geometry.processing.utils.Utils;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Getter
@Setter
@ToString
public class Triangle extends AbstractTriangle {

    private double side1;

    private double side2;

    private double side3;

    private Point p1;

    private Point p2;

    private Point p3;

    private Map<String, Point> vertices = new HashMap<>();

    private List<Bisector> bisectors = new ArrayList<>();

    public Triangle(final double side1, final double side2, final double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (!isValidTriangle(side1, side2, side3)) {
            log.error("Ошибка: стороны не могут образовать треугольник.");
        }
        this.p1 = new Point(Settings.INITIAL_COORDINATE_X, Settings.INITIAL_COORDINATE_Y, Utils.generateRandomId());
        this.p2 = new Point(Settings.INITIAL_COORDINATE_X + (float) side1, Settings.INITIAL_COORDINATE_Y, Utils.generateRandomId());
        double angle = Math.acos((side1 * side1 + side3 * side3 - side2 * side2) / (2 * side1 * side3));
        float x3 = Settings.INITIAL_COORDINATE_X + (float) (side3 * Math.cos(angle));
        float y3 = Settings.INITIAL_COORDINATE_Y + (float) (side3 * Math.sin(angle));
        this.p3 = new Point(x3, y3, Utils.generateRandomId());
        scaleTriangle();
        fillVerticesMap();
    }


    public Triangle(final Point p1, final Point p2, final Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.side1 = Utils.calculateDistance(p1, p2);
        this.side2 = Utils.calculateDistance(p2, p3);
        this.side3 = Utils.calculateDistance(p3, p1);
        if (!isValidTriangle(side1, side2, side3)) {
            log.error("Ошибка: стороны не могут образовать треугольник.");
        }
        scaleTriangle();
        fillVerticesMap();
    }

    public Triangle(final double side, final boolean isEquilateral) {
        if (isEquilateral) {
            this.p1 = new Point(Settings.INITIAL_COORDINATE_X, Settings.INITIAL_COORDINATE_Y, Utils.generateRandomId());
            this.p2 = new Point(Settings.INITIAL_COORDINATE_X + (float) side, Settings.INITIAL_COORDINATE_Y, Utils.generateRandomId());
            float x3 = Settings.INITIAL_COORDINATE_X + (float) (side * Math.cos(Math.PI / 3));
            float y3 = Settings.INITIAL_COORDINATE_Y + (float) (side * Math.sin(Math.PI / 3));
            this.p3 = new Point(x3, y3, Utils.generateRandomId());
            scaleTriangle();
            fillVerticesMap();
        }
    }


    public Triangle(final double base, final double leg) {
        this.p1 = new Point(Settings.INITIAL_COORDINATE_X, Settings.INITIAL_COORDINATE_Y, Utils.generateRandomId());
        this.p2 = new Point(Settings.INITIAL_COORDINATE_X + (float) base, Settings.INITIAL_COORDINATE_Y, Utils.generateRandomId());
        double h = Math.sqrt(leg * leg - (base / 2) * (base / 2));
        this.p3 = new Point(Settings.INITIAL_COORDINATE_X + (float) (base / 2), Settings.INITIAL_COORDINATE_Y + (float) h, Utils.generateRandomId());
        scaleTriangle();
        fillVerticesMap();
    }


    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
    public void addBisectorFromVertex(String vertexId) {
        Point startPoint = vertices.get(vertexId);
        if (startPoint == null) {
            log.error("Ошибка: вершина с идентификатором " + vertexId + " не найдена.");
            return;
        }

        List<Point> otherPoints =
                vertices.values().stream()
                        .filter(p -> !p.getId().equals(vertexId))
                        .collect(Collectors.toList());

        if (otherPoints.size() != 2) {
            log.error("Ошибка: неверное количество вершин для построения биссектрисы.");
            return;
        }

        Point midPoint =
                new Point(
                        (otherPoints.get(0).getX() + otherPoints.get(1).getX()) / 2,
                        (otherPoints.get(0).getY() + otherPoints.get(1).getY()) / 2,
                        Utils.generateRandomId());

        bisectors.add(new Bisector(startPoint, midPoint));
    }

    public void setAngleAtVertex(String vertexId, double angle) {
        log.info("Угол у вершины " + vertexId + " был изменен на: " + angle + " градусов");
    }

    @Override
    public void draw(final Graphics2D g) {
        new Line(p1, p2).draw(g);
        new Line(p2, p3).draw(g);
        new Line(p3, p1).draw(g);

        bisectors.forEach(bisector -> bisector.draw(g));
    }

    public void scaleTriangle() {
        p1.setX(p1.getX() * Settings.scale);
        p1.setY(p1.getY() * Settings.scale);

        p2.setX(p2.getX() * Settings.scale);
        p2.setY(p2.getY() * Settings.scale);

        p3.setX(p3.getX() * Settings.scale);
        p3.setY(p3.getY() * Settings.scale);

        p1.setX(p1.getX() + Settings.INITIAL_COORDINATE_X);
        p1.setY(p1.getY() + Settings.INITIAL_COORDINATE_Y);

        p2.setX(p2.getX() + Settings.INITIAL_COORDINATE_X);
        p2.setY(p2.getY() + Settings.INITIAL_COORDINATE_Y);

        p3.setX(p3.getX() + Settings.INITIAL_COORDINATE_X);
        p3.setY(p3.getY() + Settings.INITIAL_COORDINATE_Y);
    }


    private void fillVerticesMap() {
        vertices.put(p1.getId(), p1);
        vertices.put(p2.getId(), p2);
        vertices.put(p3.getId(), p3);
    }

}
