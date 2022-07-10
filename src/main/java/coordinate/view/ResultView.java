package coordinate.view;


public class ResultView {

    private static final String LINE_DISTNACE_SCRIPT = "두 점 사이 거리는 ";
    public static final double DECIMAL_PLACE = 1_000_000;
    public static final String SQUARE_WIDTH_SCRIPT = "사각형 넓이는 ";

    public static void printResult(String graph) {
        System.out.println(graph);
    }

    public static void printDistance(double distance) {
        System.out.print(LINE_DISTNACE_SCRIPT + Math.round(distance * DECIMAL_PLACE) / DECIMAL_PLACE);
    }

    public static void printWidth(double width) {
        System.out.print(SQUARE_WIDTH_SCRIPT + Math.round(width * DECIMAL_PLACE) / DECIMAL_PLACE);
    }
}
