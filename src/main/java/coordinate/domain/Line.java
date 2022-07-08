package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private Point point1;

    private Point point2;{}능
    public Line(String input) {
        String[] coordinate = input.split("-");

        this.point1 = new Point(coordinate[0]);
        this.point2 = new Point(coordinate[1]);
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public double length() {
        return point1.calcDistance(point2);
    }
    public List<Point> getPointList() {
        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);

        return points;
    }
}
