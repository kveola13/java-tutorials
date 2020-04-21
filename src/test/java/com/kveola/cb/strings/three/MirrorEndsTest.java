package com.kveola.cb.strings.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.three.MirrorEnds.mirrorEnds;
import static org.junit.jupiter.api.Assertions.*;

class MirrorEndsTest {

    @Test
    void mirrorEndsTestOne() {
        assertEquals("ab", mirrorEnds("abXYZba"));
    }

    @Test
    void mirrorEndsTestTwo() {
        assertEquals("a", mirrorEnds("abca"));
    }

    @Test
    void mirrorEndsTestThree() {
        assertEquals("aba", mirrorEnds("aba"));
    }
}