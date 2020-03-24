package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.ArrayFront.arrayFront9;
import static org.junit.jupiter.api.Assertions.*;

class ArrayFrontTest {

    @Test
    void arrayFront9TestOne() {
        assertTrue(arrayFront9(new int[]{1, 2, 9, 3, 4}));
    }

    @Test
    void arrayFront9TestTwo() {
        assertFalse(arrayFront9(new int[]{1, 2, 3, 4, 9}));
    }

    @Test
    void arrayFront9TestThree() {
        assertFalse(arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }
}