package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.NoTriples.noTriples;
import static org.junit.jupiter.api.Assertions.*;

class NoTriplesTest {

    @Test
    void noTriplesTestOne() {
        assertTrue(noTriples(new int[]{1, 1, 2, 2, 1}));
    }

    @Test
    void noTriplesTestTwo() {
        assertFalse(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
    }

    @Test
    void noTriplesTestThree() {
        assertFalse(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }
}