package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.ZeroMax.zeroMax;
import static org.junit.jupiter.api.Assertions.*;

class ZeroMaxTest {

    @Test
    void zeroMaxTestOne() {
        assertArrayEquals(new int[]{5, 5, 3, 3}, zeroMax(new int[]{0, 5, 0, 3}));
    }

    @Test
    void zeroMaxTestTwo() {
        assertArrayEquals(new int[]{3, 4, 3, 3}, zeroMax(new int[]{0, 4, 0, 3}));
    }

    @Test
    void zeroMaxTestThree() {
        assertArrayEquals(new int[]{1, 1, 0}, zeroMax(new int[]{0, 1, 0}));
    }
}