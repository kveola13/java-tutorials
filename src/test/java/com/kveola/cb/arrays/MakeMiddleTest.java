package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.MakeMiddle.makeMiddle;
import static org.junit.jupiter.api.Assertions.*;

class MakeMiddleTest {

    @Test
    void makeMiddleTestOne() {
        assertArrayEquals(new int[]{2, 3}, makeMiddle(new int[]{1, 2, 3, 4}));
    }

    @Test
    void makeMiddleTestTwo() {
        assertArrayEquals(new int[]{2, 3}, makeMiddle(new int[]{7, 1, 2, 3, 4, 9}));
    }

    @Test
    void makeMiddleTestThree() {
        assertArrayEquals(new int[]{1, 2}, makeMiddle(new int[]{1, 2}));
    }
}