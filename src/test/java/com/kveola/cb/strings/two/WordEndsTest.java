package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.WordEnds.wordEnds;
import static org.junit.jupiter.api.Assertions.*;

class WordEndsTest {

    @Test
    void wordEndsTestOne() {
        assertEquals("c13i", wordEnds("abcXY123XYijk", "XY"));
    }

    @Test
    void wordEndsTestTwo() {
        assertEquals("13", wordEnds("XY123XY", "XY"));
    }

    @Test
    void wordEndsTestThree() {
        assertEquals("11", wordEnds("XY1XY", "XY"));
    }
}