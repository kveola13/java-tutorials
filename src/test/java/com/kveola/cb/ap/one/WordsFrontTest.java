package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.WordsFront.wordsFront;
import static com.kveola.cb.ap.one.WordsFront.wordsFrontAlt;
import static org.junit.jupiter.api.Assertions.*;

class WordsFrontTest {

    @Test
    void wordsFrontTestOne() {
        assertArrayEquals(new String[]{"a"}, wordsFront(new String[]{"a", "b", "c", "d"}, 1));
    }

    @Test
    void wordsFrontTestTwo() {
        assertArrayEquals(new String[]{"a", "b"}, wordsFront(new String[]{"a", "b", "c", "d"}, 2));
    }

    @Test
    void wordsFrontTestThree() {
        assertArrayEquals(new String[]{"a", "b", "c"}, wordsFront(new String[]{"a", "b", "c", "d"}, 3));
    }

    @Test
    void wordsFrontAltAltTestOne() {
        assertArrayEquals(new String[]{"a"}, wordsFrontAlt(new String[]{"a", "b", "c", "d"}, 1));
    }

    @Test
    void wordsFrontAltTestTwo() {
        assertArrayEquals(new String[]{"a", "b"}, wordsFrontAlt(new String[]{"a", "b", "c", "d"}, 2));
    }

    @Test
    void wordsFrontAltTestThree() {
        assertArrayEquals(new String[]{"a", "b", "c"}, wordsFrontAlt(new String[]{"a", "b", "c", "d"}, 3));
    }
}