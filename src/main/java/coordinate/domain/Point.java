package coordinate.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Point {
    private static final String POINT_INPUT_REGEX_GROUP = "\\((\\d*),(\\d*)\\)";
    private static final String POINT_INPUT_REGEX = "\\(\\d*,\\d*\\)";
    private static final String ERROR_INVALID_INPUT = "입력 형식이 잘못되었습니다.";
    private double x;
    private double y;

    public Point(String input) {
        if (!isValid(input)) {
            throw new IllegalArgumentException(ERROR_INVALID_INPUT);
        }

        Pattern pattern = Pattern.compile(POINT_INPUT_REGEX_GROUP);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            this.x = Integer.parseInt(matcher.group(1));
            this.y = Integer.parseInt(matcher.group(2));
        }
    }

    private boolean isValid(String input) {
        return Pattern.matches(POINT_INPUT_REGEX, input);
    }


    public int getX() {
        return (int) x;
    }
    public int getY() {
        return (int) y;
    }
}
