package com.kveola.cb.logic.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.two.EvenlySpaced.evenlySpaced;
import static org.junit.jupiter.api.Assertions.*;

class EvenlySpacedTest {

    @Test
    void evenlySpacedTestOne() {
        assertTrue(evenlySpaced(2, 4, 6));
    }

    @Test
    void evenlySpacedTestTwo() {
        assertTrue(evenlySpaced(4, 6, 2));
    }

    @Test
    void evenlySpacedTestThree() {
        assertFalse(evenlySpaced(4, 6, 3));
    }

    @Test
    void evenlySpacedTestFour() {
        assertFalse(evenlySpaced(2, 2, 3));
    }

    @Test
    void evenlySpacedTestFive() {
        assertFalse(evenlySpaced(10, 9, 9));
    }

    @Test
    void evenlySpacedTestSix() {
        assertFalse(evenlySpaced(2, 4, 4));
    }

    @Test
    void evenlySpacedTestSeven() {
        assertFalse(evenlySpaced(2, 2, 4));
    }
}