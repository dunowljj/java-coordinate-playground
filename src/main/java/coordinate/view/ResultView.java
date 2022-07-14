package coordinate.view;

public class ResultView {

    public static final double DIGIT_LIMIT = 1_000_000.0;

    public static void showDistance(double distance) {
        System.out.println("두 점 사이의 거리는 " + (Math.round(distance * DIGIT_LIMIT) / DIGIT_LIMIT));
    }
}
