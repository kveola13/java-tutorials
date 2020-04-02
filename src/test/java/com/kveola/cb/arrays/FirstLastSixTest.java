package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.FirstLastSix.firstLast6;
import static org.junit.jupiter.api.Assertions.*;

class FirstLastSixTest {

    @Test
    void firstLast6TestOne() {
        assertTrue(firstLast6(new int[]{1, 2, 6}));
    }

    @Test
    void firstLast6TestTwo() {
        assertTrue(firstLast6(new int[]{6, 1, 2, 3}));
    }

    @Test
    void firstLast6TestThree() {
        assertFalse(firstLast6(new int[]{13, 6, 1, 2, 3}));
    }
}