package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PointTest {

    @Test
    void Point_입력받기_좌표하나() {
        //given
        String input = "(1,2)";

        //when
        Point point = new Point(input);

        //then
        Assertions.assertThat(point.getX()).isEqualTo(1);
        Assertions.assertThat(point.getY()).isEqualTo(2);
    }

    @ParameterizedTest
    @ValueSource(strings = {"fS","(1,3","(1)","(13)"})
    void Point_입력받기_잘못된_입력형식(String input) {
        Assertions.assertThatThrownBy(() -> new Point(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력 형식이 잘못되었습니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"(0,-1)","(0,-1)","(25,24)","(24,25)"})
    void Point_입력받기_0에서24(String input) {
        Assertions.assertThatThrownBy(() -> new Point(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력 형식이 잘못되었습니다.");
    }
}
