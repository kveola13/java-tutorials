package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.LastTwo.lastTwo;
import static org.junit.jupiter.api.Assertions.*;

class LastTwoTest {

    @Test
    void lastTwoTestOne() {
        assertEquals("codign", lastTwo("coding"));
    }

    @Test
    void lastTwoTestTwo() {
        assertEquals("cta", lastTwo("cat"));
    }

    @Test
    void lastTwoTestThree() {
        assertEquals("ab", lastTwo("ba"));
    }

    @Test
    void lastTwoTestFour() {
        assertEquals("a", lastTwo("a"));
    }

    @Test
    void lastTwoTestFive() {
        assertEquals("", lastTwo(""));
    }
}