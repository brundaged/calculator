package com.brundage.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }
    @Test
    public void testProduct() {
        assertEquals(6, calculator.product(2, 3));
    }
    @Test
    public void testDifference() {
        assertEquals(-1, calculator.difference(2, 3));
    }
}