package com.kveola.cb.arrays.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.three.MaxSpan.maxSpan;
import static org.junit.jupiter.api.Assertions.*;

class MaxSpanTest {

    @Test
    void maxSpanTestOne() {
        assertEquals(4, maxSpan(new int[]{1, 2, 1, 1, 3}));
    }

    @Test
    void maxSpanTestTwo() {
        assertEquals(6, maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
    }

    @Test
    void maxSpanTestThree() {
        assertEquals(6, maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
    }
}