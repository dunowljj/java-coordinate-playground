package coordinate.domain;

import java.util.List;

public class Graph {
    public static final int MAX_COORDINATE = 24;
    public static final int MIN_COORDINATE = 0;
    public static final int NUMBER_INTERVAL = 2;
    private final static String NEWLINE = System.getProperty("line.separator");
    public final static String SPACE_1 = " ";
    private final static String SPACE_2 = "  ";
    private final static String SPACE_4 = "    ";
    private final static String COORDINATE_DOT = "·";
    private final static String START_DOT = "*";
    private final static String VARTICAL_BAR = "│";
    private final static String HORIZONTAL_BAR = "ᅳᅳᅳᅳ";
    private final static StringBuilder sb = new StringBuilder();

    public String create(Points points) {
        List<Point> pointList = points.getPointList();

        for (int y = MAX_COORDINATE; y >= MIN_COORDINATE; y-=1) {
            drawY_axis(y);
            drawSpaceAndCoordinate(pointList, y);
        }
        drawX_axis();
        return sb.toString().trim();
    }
    private void drawY_axis(int y) {
        if (isNeedSecondDigit(y)) {
            sb.append(SPACE_1);
        }
        if (isEvenLine(y)) {
            sb.append(y);
        }
        if (isOddLine(y)) {
            sb.append(SPACE_2);
        }
        sb.append(VARTICAL_BAR);
    }
    private boolean isNeedSecondDigit(int y) {
        return isEvenLine(y) && isSingleDigit(y);
    }
    private boolean isSingleDigit(int y) {
        return y < 10;
    }
    private boolean isEvenLine(int y) {
        return y % 2 == 0;
    }
    private boolean isOddLine(int y) {
        return y % 2 == 1;
    }

    private void drawSpaceAndCoordinate(List<Point> points, int y) {
        sb.append(SPACE_1);
        for (int x = MIN_COORDINATE; x < MAX_COORDINATE; x++) {
            markCoordinate(points, x, y);
            sb.append(SPACE_2);
        }
        sb.append(NEWLINE);
    }
    private void markCoordinate(List<Point> points, int x, int y) {
        for (Point point : points) {
            mark(x, y, point);
        }
    }
    private void mark(int x, int y, Point point) {
        if (currIndexMatchWithPoint(x, y, point)) {
            sb.delete(sb.length() - 1, sb.length());
            sb.append(COORDINATE_DOT);
        }
    }
    private boolean currIndexMatchWithPoint(int x, int y, Point point) {
        return point.getX() == x && point.getY() == y;
    }

    private void drawX_axis () {
        drawHorizon();
        drawEvenNum();
    }
    private void drawHorizon() {
        sb.append(SPACE_2).append(START_DOT);

        for (int x = MIN_COORDINATE; x <= MAX_COORDINATE; x += NUMBER_INTERVAL) {
            sb.append(HORIZONTAL_BAR);
        }
        sb.delete(sb.length() - 4, sb.length());
    }
    private void drawEvenNum() {
        sb.append(NEWLINE).append(SPACE_2);
        for (int x = MIN_COORDINATE; x <= MAX_COORDINATE; x += NUMBER_INTERVAL) {
            sb.append(x).append(SPACE_4);
        }
    }
}
