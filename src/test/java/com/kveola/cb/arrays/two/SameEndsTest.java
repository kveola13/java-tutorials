package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.SameEnds.sameEnds;
import static org.junit.jupiter.api.Assertions.*;

class SameEndsTest {

    @Test
    void sameEndsTestOne() {
        assertFalse(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));
    }

    @Test
    void sameEndsTestTwo() {
        assertTrue(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
    }

    @Test
    void sameEndsTestThree() {
        assertFalse(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3));
    }
}