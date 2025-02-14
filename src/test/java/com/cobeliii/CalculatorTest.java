package com.cobeliii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void itShouldAddMethod() {
        Calculator underTest = new Calculator();
        int number1 = 10;
        int number2 = 20;


        assertEquals(30, underTest.add(number1, number2));
    }

    @Test
    void itShouldHandleWhenInputIsZero() {
        Calculator underTest = new Calculator();
        int number1 = 10;
        int number2 = 20;

        int result = underTest.add(0);

        assertEquals(0, result);
    }

    @Test
    void itShouldThrowExceptionWhenInputIsNegative() {
        Calculator underTest = new Calculator();

        assertThrows(ArithmeticException.class, () -> underTest.add(-1));
    }
}
