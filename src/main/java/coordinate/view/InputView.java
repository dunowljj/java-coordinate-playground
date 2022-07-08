package coordinate.view;

import coordinate.utils.InputUtils;

public class InputView {

    public static String inputCoordinate() {
        System.out.println("좌표를 입력하세요.");
        return InputUtils.getString();
    }
}
