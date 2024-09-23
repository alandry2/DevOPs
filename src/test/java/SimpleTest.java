package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleTest {
    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        assertEquals(8, a + b);
    }
    
    @Test
    public void testSubtraction() {
        int a = 5;
        int b = 3;
        assertEquals(2, a - b);
    }
}
