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

    public void tryToCalculate() {
        String input = InputView.inputCoordinate();
        Line line = new Line(input);
        Graph graph = new Graph();

        String drawing = graph.create(line.getPointList());
        double result = line.length();

        ResultView.printResult(drawing, result);
    }
}
