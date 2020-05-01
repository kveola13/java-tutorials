package com.kveola.cb.arrays.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.three.LinearIn.linearIn;
import static org.junit.jupiter.api.Assertions.*;

class LinearInTest {

    @Test
    void linearInTestOne() {
        assertTrue(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
    }

    @Test
    void linearInTestTwo() {
        assertFalse(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
    }

    @Test
    void linearInTestThree() {
        assertTrue(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }
}