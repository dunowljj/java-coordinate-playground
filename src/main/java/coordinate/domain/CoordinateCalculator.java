package coordinate.domain;

import coordinate.view.InputView;
import coordinate.view.ResultView;


public class CoordinateCalculator {
    public void calculate() {
        String input = InputView.inputCoordinate();
        Line line = new Line(input);
        Graph graph = new Graph();

        String drawing = graph.create(line.getPointList());
        double result = line.length();

        ResultView.printResult(drawing, result);
    }
}
