package coordinate.view;

public class ResultView {

    private static final String DISTANCE_SCRIPT = "두 점 사이 거리는 ";
    public static final int DECIMAL_PLACE = 1_000_000;

    public static void printResult(String graph) {
        System.out.println(graph);
    }
    public static void printDistance(double distance) {
        System.out.print(DISTANCE_SCRIPT + Math.round(distance * DECIMAL_PLACE) / DECIMAL_PLACE);
    }
}
