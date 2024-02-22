package org.dsl.geometry;

import lombok.Getter;
import org.dsl.geometry.grammar.GeometryBaseListener;
import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.elements.Line;
import org.dsl.geometry.processing.elements.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Getter
public class CustomListener extends GeometryBaseListener {

    private final List<Object> figures = new ArrayList<>();

    private static final Logger LOGGER = Logger.getLogger(CustomListener.class.getName());

    @Override
    public void enterPointDeclaration(GeometryParser.PointDeclarationContext ctx) {
        float x = Float.parseFloat(ctx.NUM(0).getText());
        float y = Float.parseFloat(ctx.NUM(1).getText());
        String id = ctx.ID().getText();

        Point point = new Point(x, y, id);
        figures.add(point);

        LOGGER.info("Добавлена точка: " + point + " с идентификатором " + id);
    }

    @Override
    public void enterLineDeclaration(GeometryParser.LineDeclarationContext ctx) {
        String startPointId = ctx.point(0).ID().getText();
        String endPointId = ctx.point(1).ID().getText();

        Point startPoint = findPointById(startPointId);
        Point endPoint = findPointById(endPointId);

        if (startPoint != null && endPoint != null) {
            Line line = new Line(startPoint, endPoint);
            figures.add(line);

            LOGGER.info("Добавлена линия: " + line);
        } else {
            LOGGER.severe("Одна из точек для линии не найдена.");
        }
    }

    private Point findPointById(String id) {
        for (Object figure : figures) {
            if (figure instanceof Point) {
                Point point = (Point) figure;
                if (point.getId().equals(id)) {
                    return point;
                }
            }
        }
        return null;
    }
}

