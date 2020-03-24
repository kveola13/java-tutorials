package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.ArrayCount.arrayCount9;
import static org.junit.jupiter.api.Assertions.*;

class ArrayCountTest {

    @Test
    void arrayCount9TestOne() {
        assertEquals(1, arrayCount9(new int[]{1, 2, 9}));
    }

    @Test
    void arrayCount9TestTwo() {
        assertEquals(2, arrayCount9(new int[]{1, 9, 9}));
    }

    @Test
    void arrayCount9TestThree() {
        assertEquals(3, arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }
}