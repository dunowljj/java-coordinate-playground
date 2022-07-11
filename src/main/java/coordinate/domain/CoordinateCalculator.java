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

        if (points.hasTwoPoints()) {
            ResultView.printDistance(new Line(points).length());
        }

        FigureFactory factory = new FigureFactoryImpl();
        Figure figure = factory.create(points);
        if (figure != null) {
            ResultView.printWidth(figure.width());
        }
    }
}
