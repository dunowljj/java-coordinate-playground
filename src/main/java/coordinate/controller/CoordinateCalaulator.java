package coordinate.controller;

import coordinate.model.Points;
import coordinate.view.InputView;

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
        Points points = new Points(InputView.requireCoordinate());
    }
}
