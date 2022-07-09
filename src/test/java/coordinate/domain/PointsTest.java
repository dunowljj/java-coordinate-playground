package coordinate.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointsTest {

    @Test
    void Points_여러개_좌표_입력받기() {
        //given
        String input = "(1,3)-(1,5)";

        Point point1 = new Point("(1,3)");
        Point point2 = new Point("(1,5)");

        //when
        Points points = new Points(input);

        // then
        assertThat(points.getPointList()).containsExactly(point1, point2);
    }
}
