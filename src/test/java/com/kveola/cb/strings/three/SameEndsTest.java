package com.kveola.cb.strings.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.three.SameEnds.sameEnds;
import static org.junit.jupiter.api.Assertions.*;

class SameEndsTest {

    @Test
    void sameEndsTestOne() {
        assertEquals("ab", sameEnds("abXYab"));
    }

    @Test
    void sameEndsTestTwo() {
        assertEquals("x", sameEnds("xx"));
    }

    @Test
    void sameEndsTestThree() {
        assertEquals("x", sameEnds("xxx"));
    }
}