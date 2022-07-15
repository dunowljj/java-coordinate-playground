package coordinate.model;

import java.security.Provider;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
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
        return getOnlySet(Point::getX).size() == 2
                && getOnlySet(Point::getY).size() == 2;
    }
    private Set<Double> getOnlySet(Function<Point,Double> function) {
        return getPoints().stream()
                .map(function)
                .collect(Collectors.toSet());
    }


    @Override
    public double area() {
        return 0;
    }
}
