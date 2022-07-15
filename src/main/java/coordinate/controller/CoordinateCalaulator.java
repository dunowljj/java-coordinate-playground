package coordinate.controller;

import coordinate.model.Figure;
import coordinate.model.FigureFactory;
import coordinate.model.Points;
import coordinate.view.InputView;
import coordinate.view.ResultView;

public class CoordinateCalaulator {

    public void run() {
        try {
            tryToRun();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            tryToRun();
        }
    }

    private void tryToRun() {
        Points points = new Points(InputView.inputCoordinate());

        Figure figure = FigureFactory.create(points);

        ResultView.printResult(figure);
    }
}
