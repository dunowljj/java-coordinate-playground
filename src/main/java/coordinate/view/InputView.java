package coordinate.view;


import coordinate.utils.InputUtil;

public class InputView {
    private static final String REQUIRE_COORDINATE_MESSAGE = "좌표를 입력하세요.";

    public static String inputCoordinate() {
        System.out.println(REQUIRE_COORDINATE_MESSAGE);
        return InputUtil.getString();
    }
}
