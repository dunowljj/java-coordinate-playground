package coordinate.model;

public class Line extends AbstractFigure {
    private final static double DIGIT_LIMIT = 1_000_000;
    public static final String LINE_LENGTH = "두 점 사이의 길이는";

    public Line(Points points) {
        super(points);
    }

    public double length() {
        return getPointList().get(0).calculateLength(getPointList().get(1));
    }

    @Override
    public String getInfo() {
        return LINE_LENGTH + (Math.round(length() * DIGIT_LIMIT) / DIGIT_LIMIT);
    }
}
