package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Points {
    private final List<Point> pointList = new ArrayList<>();

    public Points(String input) {
        String[] coordinate = input.split("-");

        for (String point : coordinate) {
            pointList.add(new Point(point));
        }
    }

    public List<Point> getPointList() {
        return pointList;
    }
}
