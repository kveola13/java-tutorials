package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.MidThree.midThree;
import static org.junit.jupiter.api.Assertions.*;

class MidThreeTest {

    @Test
    void midThreeTestOne() {
        assertArrayEquals(new int[]{2, 3, 4}, midThree(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void midThreeTestTwo() {
        assertArrayEquals(new int[]{7, 5, 3}, midThree(new int[]{8, 6, 7, 5, 3, 0, 9}));
    }

    @Test
    void midThreeTestThree() {
        assertArrayEquals(new int[]{1, 2, 3}, midThree(new int[]{1, 2, 3}));
    }
}