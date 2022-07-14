package coordinate.model;

public class Line extends AbstractFigure {


    public Line(Points points) {
        super(points);
    }

    public double length() {
        return getPoints().get(0).calculateLength(getPoints().get(1));
    }
}
