package com.kveola.cb.arrays.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.one.SameFirstLast.sameFirstLast;
import static org.junit.jupiter.api.Assertions.*;

class SameFirstLastTest {

    @Test
    void sameFirstLastTestOne() {
        assertFalse(sameFirstLast(new int[]{1, 2, 3}));
    }

    @Test
    void sameFirstLastTestTwo() {
        assertTrue(sameFirstLast(new int[]{1, 2, 3, 1}));
    }

    @Test
    void sameFirstLastTestThree() {
        assertTrue(sameFirstLast(new int[]{1, 2, 1}));
    }
}