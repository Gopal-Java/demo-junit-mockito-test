package com.junit.mock.tutorial.demo_junit_mockito_test.rest;

/**
 * CalculatorController is a simple calculator class that provides basic arithmetic operations.
 * It includes methods for addition, subtraction, multiplication, division, square, square root,    
 * power, factorial, modulus, absolute, max, min, average, cube, cube root and logarithm.
 * Each method takes two integers as input and returns the result of the operation.
 * 
 */
public class CalculatorController {

    public  int add(int a, int b) {
        return a + b;
    }

    public  int subtract(int a, int b) {
        return a - b;
    }

    public  int multiply(int a, int b) {
        return a * b;
    }
    public  int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public  int square(int a) {
        return a * a;
    }
    public  int squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Square root of negative number is not allowed.");
        }
        return (int) Math.sqrt(a);
    }

    public  int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
    public  int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative number is not allowed.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public  int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Modulus by zero is not allowed.");
        }
        return a % b;
    }
    public  int absolute(int a) {
        return Math.abs(a);
    }
    public  int max(int a, int b) {
        return Math.max(a, b);
    }

    public  int min(int a, int b) {
        return Math.min(a, b);
    }
    public  int average(int a, int b) {
        return (a + b) / 2;
    }   

    public  int cube(int a) {
        return a * a * a;
    }

    public  int cubeRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cube root of negative number is not allowed.");
        }
        return (int) Math.cbrt(a);
    }

    public  int logarithm(int a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Logarithm of non-positive number is not allowed.");
        }
        return (int) Math.log(a);
    }
}

