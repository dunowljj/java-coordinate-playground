package coordinate.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    void 점_한개_입력받기() {
        //given
        String input = "(24,0)";

        //when
        Point point = new Point(input);

        //then
        assertThat(point.getX()).isEqualTo(24);
        assertThat(point.getY()).isEqualTo(0);
    }

    @Test
    void 좌표_범위_벗어날시_예외() {
        //given
        String input = "(1,25)";

        //when, then
        assertThatThrownBy(() -> new Point(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력범위를 초과하였습니다.(0-24)");
    }
}
