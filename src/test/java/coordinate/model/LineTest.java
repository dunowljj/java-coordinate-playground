package coordinate.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.offset;

public class LineTest {
    @Test
    void 직선_길이_구하기() {
        //given
        Points points = new Points("(1,3)-(2,5)");

        //when
        Line line = new Line(points);

        //then
        Assertions.assertThat(line.length()).isEqualTo(2.23607, offset(0.000099));
    }
}
