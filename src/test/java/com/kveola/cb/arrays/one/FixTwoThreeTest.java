package com.kveola.cb.arrays.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.one.FixTwoThree.fix23;
import static org.junit.jupiter.api.Assertions.*;

class FixTwoThreeTest {

    @Test
    void fix23TestOne() {
        assertArrayEquals(new int[]{1, 2, 0}, fix23(new int[]{1, 2, 3}));
    }

    @Test
    void fix23TestTwo() {
        assertArrayEquals(new int[]{2, 0, 5}, fix23(new int[]{2, 3, 5}));
    }

    @Test
    void fix23TestThree() {
        assertArrayEquals(new int[]{1, 2, 1}, fix23(new int[]{1, 2, 1}));
    }
}