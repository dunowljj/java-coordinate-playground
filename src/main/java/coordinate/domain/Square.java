package coordinate.domain;

import java.util.*;

public class Square {
    public static final String ERROR_NOT_RECTANGLE = "직사각형이 아닙니다.";
    private Line height;
    private Line base;

    public Square(List<Point> pointList) {
        if (!isRectangle(pointList)) {
            throw new IllegalArgumentException(ERROR_NOT_RECTANGLE);
        }
        sort(pointList);

        this.height = new Line(pointList.get(0), pointList.get(1));
        this.base = new Line(pointList.get(0), pointList.get(2));
    }

    private boolean isRectangle(List<Point> pointList) {
        Set<Integer> setX = new HashSet<>();
        Set<Integer> setY = new HashSet<>();
        for (Point point : pointList) {
            setX.add(point.getX());
            setY.add(point.getY());
        }
        return setX.size() == 2 && setY.size() == 2;
    }
    private void sort(List<Point> pointList) {
        Collections.sort(pointList, new Comparator<Point>() {
           @Override
           public int compare(Point p1, Point p2) {
                if (p1.getX() == p2.getX()){
                    return p1.getY() - p2.getY();
                } else {
                    return p1.getX() - p2.getX();
                }
            }
        });
    }
    public int width() {
        return (int)height.length() * (int)base.length();
    }

    public Line getHeight() {
        return height;
    }

    public Line getBase() {
        return base;
    }
}
