package coordinate.domain;

import java.util.List;
import java.util.Objects;

public class Line {
    private Point point1;
    private Point point2;

    public Line(Points points) {
        List<Point> pointList = points.getPointList();

        this.point1 = pointList.get(0);
        this.point2 = pointList.get(1);
    }

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double length() {
        return point1.calcDistance(point2);
    }


    public Point getPoint1() {
        return point1;
    }
    public Point getPoint2() {
        return point2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(point1, line.point1) && Objects.equals(point2, line.point2)
                || Objects.equals(point2, line.point1) && Objects.equals(point1, line.point2);
    }
    @Override
    public int hashCode() {
        return Objects.hash(point1, point2);
    }
}
