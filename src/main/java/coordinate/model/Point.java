package coordinate.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Point {
    public static final String ERROR_INPUT_RANGE = "입력범위를 초과하였습니다.(0-24)";
    private double x;
    private double y;

    public Point(String input) {
        Pattern pattern = Pattern.compile("\\(([0-9]{1,2}),([0-9]{1,2})\\)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            this.x = Integer.parseInt(matcher.group(1));
            this.y = Integer.parseInt(matcher.group(2));
        }
        if (!isInRange()) {
            throw new IllegalArgumentException(ERROR_INPUT_RANGE);
        }
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private boolean isInRange() {
        return isXInRange() && isYInRange();
    }
    private boolean isYInRange() {
        return 0 <= y && y <= 24;
    }
    private boolean isXInRange() {
        return 0 <= x && x <= 24;
    }

    public double calculateLength(Point point) {
        return Math.sqrt(Math.pow(differenceX(point), 2) + Math.pow(differenceY(point), 2));
    }
    private double differenceY(Point point) {
        return y - point.getY();
    }
    private double differenceX(Point point) {
        return x - point.getX();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
