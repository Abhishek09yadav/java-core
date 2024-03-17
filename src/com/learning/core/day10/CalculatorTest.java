package com.learning.core.day10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.learning.core.day10.Calculator7;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator7 Calculator7 = new Calculator7();
        int a = 2;
        int b = 3;
        int ans = a + b;
        assertEquals(ans, Calculator7.add(a, b));
        assertEquals(-1, Calculator7.add(-2, 1));
        assertEquals(0, Calculator7.add(0, 0));
        assertEquals(100, Calculator7.add(50, 50));
    }

    @Test
    public void testSub() {
        Calculator7 Calculator7 = new Calculator7();
        assertEquals(1, Calculator7.sub(3, 2));
        assertEquals(-3, Calculator7.sub(0, 3));
        assertEquals(5, Calculator7.sub(10, 5));
        assertEquals(0, Calculator7.sub(100, 100));
    }
}
