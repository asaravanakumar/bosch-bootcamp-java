package com.labs.junit;


import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorJunit4Tests {

    static Calculator calculator = null;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
        System.out.println("Before All Called...");
    }

    @Before
    public void setup(){
        System.out.println("Setting up test data before each test case...");
    }

    @Test
    public void testAdd(){
        int result = calculator.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void testMultiply(){
        int result = calculator.multiply(10, 20);
        assertEquals(200, result);
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up test data after each test case...");
    }

    @AfterClass
    public static void cleanup() {
        System.out.println("After All called...");
        calculator = null;
    }

}
