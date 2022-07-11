package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Points {
    public static final String ERROR_OVERLAPPED_COORDINATE = "중복된 좌표는 입력할 수 없습니다.";
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
        if (isSamePointExsist(coordinate)) {
            throw new IllegalArgumentException(ERROR_OVERLAPPED_COORDINATE);
        }
    }
    private boolean isSamePointExsist(String[] coordinate) {
        return coordinate.length != pointList.size();
    }


    public List<Point> getPointList() {
        return pointList;
    }
}
