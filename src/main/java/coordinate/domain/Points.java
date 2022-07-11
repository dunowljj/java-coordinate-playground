package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Points {
    private static final int NUMBER_OF_LINE_VERTEX = 2;
    private static final String ERROR_DUPLICATED_COORDINATE = "중복된 좌표는 입력할 수 없습니다.";
    private final List<Point> pointList = new ArrayList<>();

    public Points(String input) {
        String[] coordinate = input.split("-");

        init(coordinate);

        if (samePointExist(coordinate)) {
            throw new IllegalArgumentException(ERROR_DUPLICATED_COORDINATE);
        }
    }
    private void init(String[] coordinate) {
        Set<Point> set = deduplicatePoints(coordinate);
        set.forEach((e) -> pointList.add(e));
    }
    private Set<Point> deduplicatePoints(String[] coordinate) {
        Set<Point> set = new HashSet();
        for (String point : coordinate) {
            set.add(new Point(point));
        }
        return set;
    }

    private boolean samePointExist(String[] coordinate) {
        return coordinate.length != pointList.size();
    }


    public List<Point> getPointList() {
        return pointList;
    }


    public boolean hasTwoPoints() {
        return pointList.size() == NUMBER_OF_LINE_VERTEX;
    }


    public int size() {
        return pointList.size();
    }
}
