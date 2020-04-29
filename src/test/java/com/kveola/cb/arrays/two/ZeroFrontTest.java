package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.ZeroFront.zeroFront;
import static org.junit.jupiter.api.Assertions.*;

class ZeroFrontTest {

    @Test
    void zeroFrontTestOne() {
        assertArrayEquals(new int[]{0, 0, 1, 1}, zeroFront(new int[]{1, 0, 0, 1}));
    }

    @Test
    void zeroFrontTestTwo() {
        assertArrayEquals(new int[]{0, 0, 1, 1, 1}, zeroFront(new int[]{0, 1, 1, 0, 1}));
    }

    @Test
    void zeroFrontTestThree() {
        assertArrayEquals(new int[]{0, 1}, zeroFront(new int[]{1, 0}));
    }
}