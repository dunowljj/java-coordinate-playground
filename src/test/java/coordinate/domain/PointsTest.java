package coordinate.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointsTest {

    @Test
    void 여러개_좌표_입력받기() {
        //given
        String input = "(1,3)-(1,5)";

        Point point1 = new Point("(1,3)");
        Point point2 = new Point("(1,5)");

        //when
        Points points = new Points(input);

        // then
        assertThat(points.getPointList()).contains(point1, point2);
    }

    @Test
    void 동일_좌표_예외() {
        assertThatThrownBy(() -> new Points("(1,5)-(1,5)"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("중복된 좌표는 입력할 수 없습니다.");
    }

}
