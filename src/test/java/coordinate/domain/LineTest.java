package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineTest {
    @Test
    void StraightLine_입력받기_좌표두개() {
        //given
        String input = "(1,2)-(3,4)";

        //when
        Line line = new Line(input);
        Point dot1 = line.getPoint1();
        Point dot2 = line.getPoint2();

        //then
        Assertions.assertThat(dot1.getX()).isEqualTo(1);
        Assertions.assertThat(dot1.getY()).isEqualTo(2);
        Assertions.assertThat(dot2.getX()).isEqualTo(3);
        Assertions.assertThat(dot2.getY()).isEqualTo(4);
    }
}
