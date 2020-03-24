package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.ArrayOneTwoThree.array123;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOneTwoThreeTest {

    @Test
    void array123TestOne() {
        assertTrue(array123(new int[]{1, 1, 2, 3, 1}));
    }

    @Test
    void array123TestTwo() {
        assertFalse(array123(new int[]{1, 1, 2, 4, 1}));
    }

    @Test
    void array123TestThree() {
        assertTrue(array123(new int[]{1, 1, 2, 1, 2, 3}));
    }
}