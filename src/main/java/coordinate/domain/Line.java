package coordinate.domain;

import java.util.List;

public class Line {
    private Point point1;

    private Point point2;
    public Line(List<Point> pointList) {

        this.point1 = pointList.get(0);
        this.point2 = pointList.get(1);
    }

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
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

}
