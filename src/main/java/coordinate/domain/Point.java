package coordinate.domain;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Point {
    private static final String POINT_INPUT_REGEX_GROUP = "\\((\\d*),(\\d*)\\)";
    private static final String POINT_INPUT_REGEX = "\\(\\d*,\\d*\\)";
    private static final String ERROR_INVALID_INPUT_FORMAT = "입력 형식이 잘못되었습니다.";
    public static final String ERROR_INVALID_NUMBER_OF_RANGE = "0-24 범위의 좌표만 입력가능합니다.";
    public static final int START_RANGE = 0;
    public static final int END_RANGE = 24;
    private double x;
    private double y;

    public Point(String input) {
        Pattern pattern = Pattern.compile(POINT_INPUT_REGEX_GROUP);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            this.x = Integer.parseInt(matcher.group(1));
            this.y = Integer.parseInt(matcher.group(2));
        }
        if (!isValid(input)) {
            throw new IllegalArgumentException(ERROR_INVALID_INPUT_FORMAT);
        }
        if (!isInRange()) {
            throw new IllegalArgumentException(ERROR_INVALID_NUMBER_OF_RANGE);
        }
    }
    private boolean isValid(String input) {
        return Pattern.matches(POINT_INPUT_REGEX, input);
    }
    private boolean isInRange() {
        return (START_RANGE <= x && x <= END_RANGE) &&
                (START_RANGE <= y && y <= END_RANGE);
    }


    public double calcDistance(Point point2) {
        return Math.sqrt(
                Math.pow(this.x - point2.getX(), 2) + Math.pow(this.y - point2.getY(), 2)
        );
    }
    public int getX() {
        return (int) x;
    }
    public int getY() {
        return (int) y;
    }


    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }
}
