package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.Scores100.scores100;
import static org.junit.jupiter.api.Assertions.*;

class Scores100Test {

    @Test
    void scores100TestOne() {
        assertTrue(scores100(new int[]{1, 100, 100}));
    }

    @Test
    void scores100TestTwo() {
        assertFalse(scores100(new int[]{1, 100, 99, 100}));
    }

    @Test
    void scores100TestThree() {
        assertTrue(scores100(new int[]{100, 1, 100, 100}));
    }
}