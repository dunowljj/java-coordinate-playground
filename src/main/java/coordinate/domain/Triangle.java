package coordinate.domain;

import java.util.List;

public class Triangle implements Figure{
    private final Line line1;
    private final Line line2;
    private final Line line3;

    public Triangle(Points points) {
        List<Point> pointList = points.getPointList();

        Point point1 = pointList.get(0);
        Point point2 = pointList.get(1);
        Point point3 = pointList.get(2);
        this.line1 = new Line(point1, point2);
        this.line2 = new Line(point2, point3);
        this.line3 = new Line(point3, point1);
    }


    @Override
    public double width() {
        double a = this.line1.length();
        double b = this.line2.length();
        double c = this.line3.length();

        return  1.0 / 4.0 * Math.sqrt(
               ((4.0 * a * a * b * b) - Math.pow(a * a + b * b - c * c, 2))
        ) ;
    }


    public Line getLine1() {
        return line1;
    }
    public Line getLine2() {
        return line2;
    }
    public Line getLine3() {
        return line3;
    }

}
