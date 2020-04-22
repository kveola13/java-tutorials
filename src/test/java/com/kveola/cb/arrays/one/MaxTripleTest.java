package com.kveola.cb.arrays.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.one.MaxTriple.maxTriple;
import static org.junit.jupiter.api.Assertions.*;

class MaxTripleTest {

    @Test
    void maxTripleTestOne() {
        assertEquals(3, maxTriple(new int[]{1, 2, 3}));
    }
    @Test
    void maxTripleTestTwo() {
        assertEquals(5, maxTriple(new int[]{1, 5, 3}));
    }
    @Test
    void maxTripleTestThree() {
        assertEquals(5, maxTriple(new int[]{5, 2, 3}));
    }
}