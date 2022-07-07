package coordinate.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Point {
    private static final String POINT_INPUT_REGEX_GROUP = "\\((\\d*),(\\d*)\\)";
    private static final String POINT_INPUT_REGEX = "\\(\\d*,\\d*\\)";
    private static final String ERROR_INVALID_INPUT_FORMAT = "입력 형식이 잘못되었습니다.";
    public static final int START_RANGE = 0;
    public static final int END_RANGE = 24;
    public static final String ERROR_INVALID_NUMBER_OF_RANGE = "0-24 범위의 좌표만 입력가능합니다.";
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

    public int getX() {
        return (int) x;
    }
    public int getY() {
        return (int) y;
    }
}
