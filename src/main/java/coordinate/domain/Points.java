package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Points {
    private static final int NUMBER_OF_LINE_VERTEX = 2;
    private static final int NUMBER_OF_TRIANGLE_VERTEX = 3;
    private static final int NUMBER_OF_SQUARE_VERTEX = 4;
    private static final String ERROR_OVERLAPPED_COORDINATE = "중복된 좌표는 입력할 수 없습니다.";
    private final List<Point> pointList = new ArrayList<>();

    public Points(String input) {
        String[] coordinate = input.split("-");
        Set<Point> set = new HashSet();
        for (String point : coordinate) {
            set.add(new Point(point));
        }
        for (Point point : set) {
            pointList.add(point);
        }
        if (samePointExist(coordinate)) {
            throw new IllegalArgumentException(ERROR_OVERLAPPED_COORDINATE);
        }
    }
    private boolean samePointExist(String[] coordinate) {
        return coordinate.length != pointList.size();
    }


    public List<Point> getPointList() {
        return pointList;
    }


    public boolean isLine() {
        return pointList.size() == NUMBER_OF_LINE_VERTEX;
    }

    public boolean hasThreePoints() {
        return pointList.size() == NUMBER_OF_TRIANGLE_VERTEX;
    }

    public boolean hasFourPoints() {
        return pointList.size() == NUMBER_OF_SQUARE_VERTEX;
    }
}
