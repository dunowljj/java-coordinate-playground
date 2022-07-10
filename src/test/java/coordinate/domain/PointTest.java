package coordinate.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    void 입력받기_좌표하나() {
        //given
        String input = "(1,2)";

        //when
        Point point = new Point(input);

        //then
        assertThat(point.getX()).isEqualTo(1);
        assertThat(point.getY()).isEqualTo(2);
    }

    @ParameterizedTest
    @ValueSource(strings = {"fS","(1,3","(1)","(13)","(-1,3)"})
    void 입력받기_잘못된_입력형식(String input) {
        assertThatThrownBy(() -> new Point(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력 형식이 잘못되었습니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"(0,28)","(0,30)","(25,24)","(24,25)"})
    void 입력받기_0에서24_벗어나면_예외(String input) {
        assertThatThrownBy(() -> new Point(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("0-24 범위의 좌표만 입력가능합니다.");
    }
}
