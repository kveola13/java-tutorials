package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.ScoresClump.scoresClump;
import static org.junit.jupiter.api.Assertions.*;

class ScoresClumpTest {

    @Test
    void scoresClumpTestOne() {
        assertTrue(scoresClump(new int[]{3, 4, 5}));
    }

    @Test
    void scoresClumpTestTwo() {
        assertFalse(scoresClump(new int[]{3, 4, 6}));
    }

    @Test
    void scoresClumpTestThree() {
        assertTrue(scoresClump(new int[]{1, 3, 5, 5}));
    }
}