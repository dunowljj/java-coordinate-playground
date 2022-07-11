package coordinate.domain;

import coordinate.view.InputView;
import coordinate.view.ResultView;


public class CoordinateCalculator {

    public int calculate() {
        try {
            tryToCalculate();
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return calculate();
        }
        return 1;
    }
    private void tryToCalculate() {
        String input = InputView.inputCoordinate();
        Points points = new Points(input);

        Graph graph = new Graph();
        String drawing = graph.create(points);
        ResultView.printGraph(drawing);

        if (hasTwoPoints(points)) {
            ResultView.printDistance(new Line(points).length());
        }

        Figure figure = create(points);
        if (figure != null) {
            ResultView.printWidth(figure.width());
        }
    }
    private boolean hasTwoPoints(Points points) {
        return points.isLine();
    }

    private static Figure create(Points points) {
        if (hasFourPoints(points)) {
            return new Square(points);
        }
        if (hasThreePoints(points)) {
            return new Triangle(points);
        }
        return null;
    }
    private static boolean hasThreePoints(Points points) {
        return points.hasThreePoints();
    }
    private static boolean hasFourPoints(Points points) {
        return points.hasFourPoints();
    }
}
