package coordinate.domain;

import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.List;


public class CoordinateCalculator {

    public static final int NUMBER_OF_SQUARE_VERTEX = 4;
    public static final int NUMBER_OF_TRIANGLE_VERTEX = 3;
    public static final int NUMBER_OF_POINT_IN_LINE = 2;

    public int calculate() {
        try {
            tryToCalculate();
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return calculate();
        }
        return 1;
    }

    public void tryToCalculate() {
        String input = InputView.inputCoordinate();
        Points points = new Points(input);
        List<Point> pointList = points.getPointList();

        Graph graph = new Graph();
        String drawing = graph.create(pointList);
        ResultView.printResult(drawing);

        if (hasTwoPoints(pointList)) {
            Line line = new Line(pointList);
            ResultView.printDistance(line.length());
        }

        Figure figure = create(pointList);
        ResultView.printWidth(figure.width());

    }
    private boolean hasTwoPoints(List<Point> pointList) {
        return pointList.size() == NUMBER_OF_POINT_IN_LINE;
    }

    private static Figure create(List<Point> pointList) {
        if (hasFourPoints(pointList)) {
            return new Square(pointList);
        }
        if (hasThreePoints(pointList)) {
            return new Triangle(pointList);
        }
        return null;
    }
    private static boolean hasThreePoints(List<Point> pointList) {
        return pointList.size() == NUMBER_OF_TRIANGLE_VERTEX;
    }
    private static boolean hasFourPoints(List<Point> pointList) {
        return pointList.size() == NUMBER_OF_SQUARE_VERTEX;
    }
}
