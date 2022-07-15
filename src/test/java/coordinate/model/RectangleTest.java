package coordinate.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RectangleTest {
    @Test
    void 직사각형_아니면_예외() {
        //given
        String input = "(3,5)-(7,5)-(1,3)-(7,3)";

        //when, then
        assertThatThrownBy(() -> new Rectangle(new Points(input)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("직사각형이 아닙니다.");
    }

    @Test
    void 직사각형_녋이_구하기() {
        //given
        String input = "(1,5)-(7,5)-(1,3)-(7,3)";

        //when
        Rectangle rectangle = new Rectangle(new Points(input));

        //then
        assertThat(rectangle.area()).isEqualTo(12);
    }
}
