package coordinate.model;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Rectangle extends AbstractFigure {

    public static final String ERROR_NOT_RECTANGLE = "직사각형이 아닙니다.";

    public Rectangle(Points points) {
        super(points);
        if (!isRectangle()) {
            throw new IllegalArgumentException(ERROR_NOT_RECTANGLE);
        }
    }
    private boolean isRectangle() {
        return getOnlyXList().size() == 2 &&  getOnlyYList().size() == 2;
    }
    private List<Double> getOnlyXList() {
        return getOnlySet(Point::getX).stream().collect(Collectors.toList());
    }
    private List<Double> getOnlyYList() {
        return getOnlySet(Point::getY).stream().collect(Collectors.toList());
    }
    private Set<Double> getOnlySet(Function<Point,Double> function) {
        return getPoints().stream()
                .map(function)
                .collect(Collectors.toSet());
    }

    @Override
    public double area() {
        return getMinusX() * getMinusY();
    }
    private double getMinusX() {
        return Math.abs(getOnlyXList().get(0) - getOnlyXList().get(1));
    }
    private double getMinusY() {
        return Math.abs(getOnlyYList().get(0) - getOnlyYList().get(1));
    }
}
