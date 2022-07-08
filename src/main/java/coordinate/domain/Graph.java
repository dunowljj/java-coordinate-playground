package coordinate.domain;

import java.util.List;

public class Graph {
    private final StringBuilder sb = new StringBuilder();
    private final String NEWLINE = System.getProperty("line.separator");
    public final String SPACE_1 = " ";
    private final String SPACE_2 = "  ";
    private final String SPACE_4 = "    ";
    private final String COORDINATE_DOT = "*";
    private final String START_DOT = "*";
    private final String VARTICAL_BAR = "│";
    private final String HORIZONTAL_BAR = "ᅳᅳᅳᅳ";

    public String create(List<Point> points) {

        for (int y = 24; y >= 0; y-=1) {
            drawY_axis(y);
            drawSpaceAndCoordinate(points, y);
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
        for (int x = 0; x < 24; x++) {
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
        if (point.getX() == x && point.getY() == y ) {
            sb.delete(sb.length() - 1, sb.length());
            sb.append(COORDINATE_DOT);
        }
    }

    private void drawX_axis () {
        drawHorizon();
        drawEvenNum();
    }
    private void drawHorizon() {
        sb.append(SPACE_2).append(START_DOT);

        for (int x = 0; x <= 24; x += 2) {
            sb.append(HORIZONTAL_BAR);
        }
        sb.delete(sb.length() - 4, sb.length());
    }
    private void drawEvenNum() {
        sb.append(NEWLINE).append(SPACE_2);
        for (int x = 0; x <= 24; x += 2) {
            sb.append(x).append(SPACE_4);
        }
    }
}
