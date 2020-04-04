package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.HasTwoThree.has23;
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
}