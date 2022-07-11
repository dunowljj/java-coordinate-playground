package coordinate.domain;


import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class TriangleTest {

    @Test
    void 좌표저장() {
        //given
        String input = "(1,3)-(5,10)-(12,19)";
        Points points = new Points(input);

        List<Line> lineList = new ArrayList<>();
        lineList.add(new Line(new Point(("(1,3)")), new Point("(5,10)")));
        lineList.add(new Line(new Point(("(5,10)")), new Point("(12,19)")));
        lineList.add(new Line(new Point(("(12,19)")), new Point("(1,3)")));

        //when
        Triangle triangle = new Triangle(points);

        //then
        assertThat(lineList).contains(triangle.getLine1(), triangle.getLine2(), triangle.getLine3());
    }

    @Test
    void 넓이구하기() {
        //given
        String input = "(1,4)-(1,7)-(4,7)";
        Points points = new Points(input);

        //when
        Triangle triangle = new Triangle(points);

        //then
        assertThat(triangle.width()).isEqualTo(4.5, offset(0.00099));

    }
}
