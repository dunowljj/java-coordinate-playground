package coordinate.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointsTest {

    @Test
    void 점_두개_입력받기() {
        //given
        String input = "(1,3)-(2,5)";

        //when
        Points points = new Points(input);

        //then
        assertThat(points.get(0)).isEqualTo(new Point("(1,3)"));
        assertThat(points.get(1)).isEqualTo(new Point("(2,5)"));
    }

    @Test
    void 같은_점_입력시_예외() {
        //given
        String input = "(1,3)-(1,3)";

        //when, then
        assertThatThrownBy(() -> new Points(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("동일한 좌표가 입력되었습니다.");
    }
}
