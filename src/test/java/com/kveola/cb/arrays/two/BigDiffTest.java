package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.BigDiff.bigDiff;
import static org.junit.jupiter.api.Assertions.*;

class BigDiffTest {

    @Test
    void bigDiffTestOne() {
        assertEquals(7, bigDiff(new int[]{10, 3, 5, 6}));
    }

    @Test
    void bigDiffTestTwo() {
        assertEquals(8, bigDiff(new int[]{7, 2, 10, 9}));
    }

    @Test
    void bigDiffTestThree() {
        assertEquals(8, bigDiff(new int[]{2, 10, 7, 2}));
    }
}