package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.HasBad.hasBad;
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