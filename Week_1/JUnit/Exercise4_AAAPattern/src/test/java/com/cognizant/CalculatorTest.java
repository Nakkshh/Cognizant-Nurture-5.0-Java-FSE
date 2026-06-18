package com.cognizant;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {

        calculator = new Calculator();
        System.out.println("Setup completed");

    }

    @After
    public void tearDown() {

        calculator = null;
        System.out.println("Teardown completed");

    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 15;
        int b = 10;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(25, result);

    }

    @Test
    public void testMultiplication() {

        // Arrange
        int a = 5;
        int b = 6;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(30, result);

    }

}