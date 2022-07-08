package coordinate.view;

public class ResultView {

    private static final String DISTANCE_SCRIPT = "두 점 사이 거리는 ";
    public static final int DECIMAL_PLACE = 1_000_000;

    public static void printResult(String graph, double result) {
        System.out.println(graph);
        System.out.print(DISTANCE_SCRIPT + Math.round(result * DECIMAL_PLACE) / DECIMAL_PLACE);
    }
}
