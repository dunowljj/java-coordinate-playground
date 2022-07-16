package coordinate.model;

public class Triangle extends AbstractFigure {

    public static final String ERROR_COORDINATE_IN_STRAIGHT = "3개의 좌표가 일직선상에 있습니다.";
    private final static double DIGIT_LIMIT = 1_000_000.0;
    public static final String TRIANGLE_WIDTH = "삼각형 넓이는 ";

    public Triangle(Points points) {
        super(points);

        if (isInStraight(points)) {
            throw new IllegalArgumentException(ERROR_COORDINATE_IN_STRAIGHT);
        }
    }
    private boolean isInStraight(Points points) {
        return points.isInStraight();
    }

    @Override
    public double area() {
        Points points = getPoints();
        double side1 = points.get(0).calculateLength(points.get(1));
        double side2 = points.get(1).calculateLength(points.get(2));
        double side3 = points.get(2).calculateLength(points.get(0));
        return CaluclateByHeronFomula(side1, side2, side3);
    }
    private double CaluclateByHeronFomula(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String getInfo() {
        return TRIANGLE_WIDTH + (Math.round(area() * DIGIT_LIMIT) / DIGIT_LIMIT);
    }
}
