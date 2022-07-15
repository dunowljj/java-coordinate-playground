package coordinate.model;

import java.util.List;

public interface Figure{

    List<Point> getPointList();

    Points getPoints();

    double area();

    String getInfo();
}
