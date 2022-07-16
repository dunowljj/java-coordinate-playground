package coordinate.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

public class Points {
    public static final String INVALID_INPUT = "잘못된 입력입니다.";
    public static final String ERROR_SAME_POINT = "동일한 좌표가 입력되었습니다.";
    public static final String INPUT_VERIFICATION_REGEX = "\\(\\d{1,2},\\d{1,2}\\)(-\\(\\d{1,2},\\d{1,2}\\)){0,3}";
    private final List<Point> points = new ArrayList<>();

    public Points(String input) {
        checkValidInput(input);
        
        String[] coordinate = input.split("-");

        for (String pointInput : coordinate) {
            points.add(new Point(pointInput));
        }

        checkPointDuplication();
    }

    public boolean hasPoint(int x, int y) {
        return points.stream()
                .anyMatch((point -> point.equals(new Point(x, y))));
    }

    private void checkValidInput(String input) {
        boolean valid = Pattern.matches(INPUT_VERIFICATION_REGEX, input);
        
        if (!valid) {
            throw new IllegalArgumentException(INVALID_INPUT);
        }
    }

    private void checkPointDuplication() {
        if(samePointsExist()) {
            throw new IllegalArgumentException(ERROR_SAME_POINT);
        }
    }
    private boolean samePointsExist() {
        return new HashSet<>(points).size() != points.size();
    }

    public boolean isInStraight() {
        return points.get(0).getSlope(points.get(1)) == points.get(1).getSlope(points.get(2));
    }

    public int size() {
        return points.size();
    }

    public Point get(int i) {
        return points.get(i);
    }

    public List<Point> getPoints() {
        return points;
    }
}
