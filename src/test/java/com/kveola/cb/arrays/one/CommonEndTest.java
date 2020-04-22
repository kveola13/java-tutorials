package com.kveola.cb.arrays.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.one.CommonEnd.commonEnd;
import static org.junit.jupiter.api.Assertions.*;

class CommonEndTest {

    @Test
    void commonEndTestOne() {
        assertTrue(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
    }

    @Test
    void commonEndTestTwo() {
        assertFalse(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
    }

    @Test
    void commonEndTestThree() {
        assertTrue(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
    }
}