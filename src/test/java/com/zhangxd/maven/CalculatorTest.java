package com.zhangxd.maven;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();

        int actualResult = calculator.sum(5,3);

        int expectedResult = 8;

        assertEquals(expectedResult,actualResult);


    }
}
