package coordinate.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Points {
    private final List<Point> points = new ArrayList<>();

    public Points(String input) {
        String[] coordinate = input.split("-");

        for (String pointInput : coordinate) {
            points.add(new Point(pointInput));
        }

        if(samePointsExist()) {
            throw new IllegalArgumentException("동일한 좌표가 입력되었습니다.");
        }
    }
    private boolean samePointsExist() {
        return new HashSet<>(points).size() != points.size();
    }

    public Point get(int i) {
        return points.get(i);
    }
}
