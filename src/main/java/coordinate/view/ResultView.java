package coordinate.view;

import coordinate.model.Figure;
import coordinate.model.Points;

public class ResultView {

    public static final double DIGIT_LIMIT = 1_000_000.0;
    public static final String VERTICAL_AXIS = "|";
    public static final String SPACE_TWO = "  ";
    public static final String AXIS_START_DOT = "*";
    public static final String SPCAE_ONE = " ";
    public static final String SPACE_THREE = "   ";
    public static final int MAX_NUMBER = 24;
    public static final int MIN_NUMBER = 0;
    public static final String COORDINATE_DOT = "·";
    public static final String HORIZON_AXIS = "----";

    public static void printResult(Figure figure) {

    }

    public static void printResultGraph(Points points) {
        printYAxisWith(points);
        printXAxisAndNumbers();
    }

    private static void printYAxisWith(Points points) {
        for (int i = MAX_NUMBER; i >= MIN_NUMBER; i--) {
            printYAxis(i);
            printCoordinate(i, points);
        }
    }

    private static void printYAxis(int i) {
        if (i % 2 == 0 && i < 10) {
            System.out.print(SPCAE_ONE);
        }
        if (i % 2 == 0) {
            System.out.print(i + VERTICAL_AXIS);
        }
        if (i % 2 == 1) {
            System.out.print(SPACE_TWO + VERTICAL_AXIS);
        }
    }

    private static void printCoordinate(int y, Points points) {
        for (int x = MIN_NUMBER; x <= MAX_NUMBER; x++) {
            if (x % 2 == 0 && x >= 10) {
                System.out.print(SPCAE_ONE);
            }
            if (points.hasPoint(x, y)) {
                System.out.print(COORDINATE_DOT);
                System.out.print(SPCAE_ONE);
            }
            if (!points.hasPoint(x, y)) {
                System.out.print(SPACE_TWO);
            }
        }
        System.out.println();
    }

    private static void printXAxisAndNumbers() {
        pirntXAxis();
        printXNumbers();
    }

    private static void printXNumbers() {
        for (int i = MIN_NUMBER; i <= MAX_NUMBER; i+=2) {
            System.out.print(SPACE_THREE + i);
        }
        System.out.println();
    }

    private static void pirntXAxis() {
        System.out.print(SPACE_TWO + AXIS_START_DOT);

        for (int i = MIN_NUMBER; i <= MAX_NUMBER + 2; i+=2) {
            System.out.print(HORIZON_AXIS);
        }
        System.out.println();
    }

    public static void showDistance(double distance) {
        System.out.println("두 점 사이의 거리는 " + (Math.round(distance * DIGIT_LIMIT) / DIGIT_LIMIT));
    }

}
