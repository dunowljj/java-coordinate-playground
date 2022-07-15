package coordinate.model;

import java.util.List;

public class AbstractFigure implements Figure{
    private Points points;

    public AbstractFigure(Points points) {
        this.points = points;
    }

    public double area() {
        return 0;
    }


    @Override
    public String getInfo() {
        return "AbstractFigure";
    }

    public Points getPoints() {
        return points;
    }

    @Override
    public List<Point> getPointList() {
        return points.getPoints();
    }
}
