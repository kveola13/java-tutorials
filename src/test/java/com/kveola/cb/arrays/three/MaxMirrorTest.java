package com.kveola.cb.arrays.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.three.MaxMirror.maxMirror;
import static org.junit.jupiter.api.Assertions.*;

class MaxMirrorTest {

    @Test
    void maxMirrorTestOne() {
        assertEquals(3, maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
    }

    @Test
    void maxMirrorTestTwo() {
        assertEquals(3, maxMirror(new int[]{1, 2, 1, 4}));
    }

    @Test
    void maxMirrorTestThree() {
        assertEquals(2, maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
    }
}