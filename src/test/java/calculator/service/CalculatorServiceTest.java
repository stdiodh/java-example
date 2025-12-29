package test.java.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import calculator.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private CalculatorService calculatorService;
    private static final int numA = 1;
    private static final int numB = 2;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    @DisplayName("add 함수는 두 숫자를 더한다")
    void testUseAddMethod() {
        int result = calculatorService.add(numA, numB);

        assertEquals(3, result);
    }


    @Test
    @DisplayName("minus 함수는 두 숫자의 차를 구한다")
    void testUserMinusMethod() {
        int result = calculatorService.minus(numA, numB);

        assertEquals(-1, result);
    }
}
