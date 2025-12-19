package test.java.programmers.Lv0.MyStringTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import programmers.Lv0.MyString.MyStringSolution.StringController;

public class MyStringTest {

    @ParameterizedTest
    @CsvSource(value = {"1a2b3c, 6", "aAb1B2cC34oOp, 37"})
    void 내_문자열_계산_검증_테스트(String input, int expected) {
        StringController stringController = new StringController();
        int result = stringController.calculate(input);

        assertEquals(expected, result);
    }
}
