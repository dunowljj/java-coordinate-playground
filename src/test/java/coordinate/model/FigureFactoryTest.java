package coordinate.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FigureFactoryTest {

    @Test
    void Line_생성() {
        //given
        String input = "(1,4)-(5,7)";

        //when
        Figure figure = FigureFactory.create(new Points(input));

        //then
        Assertions.assertThat(figure).isInstanceOf(Line.class);
    }

    @Test
    void Rectangle_생성() {
        //given
        String input = "(1,5)-(7,5)-(1,3)-(7,3)";

        //when
        Figure figure = FigureFactory.create(new Points(input));

        //then
        Assertions.assertThat(figure).isInstanceOf(Rectangle.class);
    }

    @Test
    void Triangle_생성() {
        //given
        String input = "(1,5)-(7,5)-(1,3)";

        //when
        Figure figure = FigureFactory.create(new Points(input));

        //then
        Assertions.assertThat(figure).isInstanceOf(Triangle.class);
    }
}
