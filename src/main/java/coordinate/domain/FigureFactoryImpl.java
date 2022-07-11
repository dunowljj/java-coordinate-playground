package coordinate.domain;

public class FigureFactoryImpl implements FigureFactory {

    @Override
    public Figure create(Points points) {
        if (points.size() == 3) {
            return new Triangle(points);
        }
        if (points.size() == 4) {
            return new Square(points);
        }
        return null;
    }
}
