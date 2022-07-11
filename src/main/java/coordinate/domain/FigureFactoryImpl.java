package coordinate.domain;

public class FigureFactoryImpl implements FigureFactory {
    @Override
    public Figure create(Points points) {
        if (points.hasThreePoints()) {
            return new Triangle(points);
        }
        if (points.hasFourPoints()) {
            return new Square(points);
        }
        return null;
    }
}
