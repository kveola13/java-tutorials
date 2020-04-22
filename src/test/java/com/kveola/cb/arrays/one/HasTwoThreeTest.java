package com.kveola.cb.arrays.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.one.HasTwoThree.has23;
import static com.kveola.cb.arrays.one.HasTwoThree.no23;
import static org.junit.jupiter.api.Assertions.*;

class HasTwoThreeTest {

    @Test
    void has23TestOne() {
        assertTrue(has23(new int[]{2, 5}));
    }

    @Test
    void has23TestTwo() {
        assertTrue(has23(new int[]{4, 3}));
    }

    @Test
    void has23TestThree() {
        assertFalse(has23(new int[]{4, 5}));
    }

    @Test
    void no23TestOne() {
        assertTrue(no23(new int[]{4, 5}));
    }

    @Test
    void no23TestTwo() {
        assertFalse(no23(new int[]{4, 2}));
    }

    @Test
    void no23TestThree() {
        assertFalse(no23(new int[]{3, 5}));
    }
}