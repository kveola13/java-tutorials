package com.kveola.cb.arrays.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.one.DoubleTwoThree.double23;
import static org.junit.jupiter.api.Assertions.*;

class DoubleTwoThreeTest {

    @Test
    void double23TestOne() {
        assertTrue(double23(new int[]{2, 2}));
    }

    @Test
    void double23TestTwo() {
        assertTrue(double23(new int[]{3, 3}));
    }

    @Test
    void double23TestThree() {
        assertFalse(double23(new int[]{2, 3}));
    }
}