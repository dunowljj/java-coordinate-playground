package coordinate.domain;

import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.List;


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

    public void tryToCalculate() {
        String input = InputView.inputCoordinate();
        Points points = new Points(input);
        List<Point> pointList = points.getPointList();

        Graph graph = new Graph();
        String drawing = graph.create(pointList);
        ResultView.printResult(drawing);

        if (pointList.size() == 2) {
            Line line = new Line(pointList);
            ResultView.printDistance(line.length());
        }
        if (pointList.size() == 4) {
            Square square = new Square(pointList);
            ResultView.printWidth(square.width());
        }
    }
}
