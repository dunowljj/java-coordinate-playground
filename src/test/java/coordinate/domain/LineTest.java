package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LineTest {
    @Test
    void 입력받기_좌표두개() {
        //given
        String input = "(1,2)-(3,4)";

        //when
        Line line = new Line(input);
        Point dot1 = line.getPoint1();
        Point dot2 = line.getPoint2();

        //then
        assertThat(dot1.getX()).isEqualTo(1);
        assertThat(dot1.getY()).isEqualTo(2);
        assertThat(dot2.getX()).isEqualTo(3);
        assertThat(dot2.getY()).isEqualTo(4);
    }

    @Test
    void 직선_거리_계산() {
        //given
        Line line = new Line("(1,2)-(3,4)");

        //then
        assertThat(line.length()).isEqualTo(2.8284, offset(0.00099));
    }
}
