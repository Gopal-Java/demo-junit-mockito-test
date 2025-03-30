package com.junit.mock.tutorial.demo_junit_mockito_test.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

   CalculatorController calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CalculatorController();
    }

    @Test
    public void testMultiply(){
        int a  = 10;
        int b = -3;
        int result = calculator.multiply(a,b);

        assertEquals(-30, result);

        System.out.println("Multiplication test passed: " + a + " * " + b + " = " + result);
    }

}
