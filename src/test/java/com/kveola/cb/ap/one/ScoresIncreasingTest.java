package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.ScoresIncreasing.scoresIncreasing;
import static org.junit.jupiter.api.Assertions.*;

class ScoresIncreasingTest {

    @Test
    void scoresIncreasingTestOne() {
        assertTrue(scoresIncreasing(new int[]{1, 3, 4}));
    }

    @Test
    void scoresIncreasingTestTwo() {
        assertFalse(scoresIncreasing(new int[]{1, 3, 2}));
    }

    @Test
    void scoresIncreasingTestThree() {
        assertTrue(scoresIncreasing(new int[]{1, 1, 4}));
    }
}