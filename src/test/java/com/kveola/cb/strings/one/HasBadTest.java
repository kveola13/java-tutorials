package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.HasBad.hasBad;
import static org.junit.jupiter.api.Assertions.*;

class HasBadTest {

    @Test
    void hasBadTestOne() {
        assertTrue(hasBad("badxx"));
    }
    @Test
    void hasBadTestTwo() {
        assertTrue(hasBad("xbadxx"));
    }
    @Test
    void hasBadTestThree() {
        assertFalse(hasBad("xxbadxx"));
    }
}