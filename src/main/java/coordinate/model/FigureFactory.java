package coordinate.model;

import coordinate.Triangle;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {

    static final Map<Integer, Function<Points, Figure>> classfier = new HashMap<>();

    static {
        classfier.put(2, (points -> new Line(points)));
        classfier.put(3, (points -> new Triangle(points)));
        classfier.put(4, (points -> new Rectangle(points)));
    }
    public static Figure create(Points points) {
        return classfier.get(points.size()).apply(points);
    }
}

