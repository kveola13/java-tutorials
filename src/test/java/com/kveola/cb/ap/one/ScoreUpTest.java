package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.ScoreUp.scoreUp;
import static org.junit.jupiter.api.Assertions.*;

class ScoreUpTest {

    @Test
    void scoreUpTestOne() {
        assertEquals(6, scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "c"}));
    }

    @Test
    void scoreUpTestTwo() {
        assertEquals(11, scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"}));
    }

    @Test
    void scoreUpTestThree() {
        assertEquals(16, scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "b"}));
    }

    @Test
    void scoreUpTestFour() {
        assertEquals(3, scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"?", "c", "b", "?"}));
    }
}