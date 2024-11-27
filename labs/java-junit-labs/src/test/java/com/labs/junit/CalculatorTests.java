package com.labs.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {

    static Calculator calculator = null;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
        System.out.println("Before All Called...");
    }

    @BeforeEach
    public void setup(){
        System.out.println("Setting up test data before each test case...");
    }

    @Test
    public void givenTwoArgsPositive_thenReturnResult(){
        int result = calculator.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void givenTwoArgsNegative_thenThrowException(){
        Throwable ex = assertThrows(IllegalArgumentException.class, () -> calculator.add(-10, -20));
        assertEquals("Negative numbers are not", ex.getMessage());
    }

    @Test
    public void testMultiply(){
        int result = calculator.multiply(10, 20);
        assertEquals(200, result);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up test data after each test case...");
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("After All called...");
        calculator = null;
    }

}
