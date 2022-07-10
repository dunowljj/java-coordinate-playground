package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class SquareTest {
   /* @Test
    void Square_사각형_좌표저장() {
        //given
        String input = "(1,3)-(2,3)-(2,5)-(1,5)";
        Points points = new Points(input);
        List<Point> pointList = points.getPointList();

        //when
        Square square = new Square(pointList);

        //then
        assertThat(square.getPointList()).contains(pointList.get(0), pointList.get(1)
                , pointList.get(2), pointList.get(3));
    }*/

    @Test
    void Square_직사각형_아니면_예외() {
        //given
        String input = "(1,3)-(2,4)-(6,5)-(1,5)";
        Points points = new Points(input);
        List<Point> pointList = points.getPointList();

        //when, then
        assertThatThrownBy(() -> new Square(pointList))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("직사각형이 아닙니다.");
    }

    @Test
    void Square_직사각형_넓이() {
        //given
        String input = "(1,3)-(2,3)-(2,5)-(1,5)";
        Points points = new Points(input);
        Square square = new Square(points.getPointList());

        //when
        assertThat(square.width()).isEqualTo(2);
    }
}
