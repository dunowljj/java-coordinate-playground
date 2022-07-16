package coordinate.model;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TriangleTest {

    @Test
    void 삼각형_좌표확인() {
        //given
        String input = "(1,3)-(4,5)-(14,7)";

        //when
        Points points = new Points(input);
        Triangle triangle = new Triangle(points);

        //then
        assertThat(triangle.getPointList())
                .contains(new Point(1, 3), new Point(4, 5), new Point(14, 7));
    }


    @Test
    void 직선이면_예외() {
        //given
        String input = "(1,4)-(2,8)-(3,12)";

        //when
        Points points = new Points(input);

        //then
        assertThatThrownBy(() -> new Triangle(points))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("3개의 좌표가 일직선상에 있습니다.");
    }

    @Test
    void 삼각형_넓이_구하기() {
        //given
        String input = "(1,5)-(4,5)-(4,10)";

        //when
        Points points = new Points(input);
        Triangle triangle = new Triangle(points);

        //then
        assertThat(triangle.area()).isEqualTo(15.0 / 2.0, Offset.offset(0.00099));
    }
}
