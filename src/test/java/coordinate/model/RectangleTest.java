package coordinate.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void 직사각형아니면_예외() {
        //given
        String input = "(3,5)-(7,5)-(1,3)-(7,3)";

        //when, then
        Assertions.assertThatThrownBy(() -> new Rectangle(new Points(input)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("직사각형이 아닙니다.");
    }
}
