package coordinate;

import coordinate.model.AbstractFigure;
import coordinate.model.Points;

public class Triangle extends AbstractFigure {

    public Triangle(Points points) {
        super(points);

        if (isInStraight(points)) {
            throw new IllegalArgumentException("3개의 좌표가 일직선상에 있습니다.");
        }
    }
    private boolean isInStraight(Points points) {
        return points.isInStraight();
    }
}
