package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.ScoresAverage.scoresAverage;
import static org.junit.jupiter.api.Assertions.*;

class ScoresAverageTest {

    @Test
    void scoresAverageTestOne() {
        assertEquals(4, scoresAverage(new int[]{2, 2, 4, 4}));
    }

    @Test
    void scoresAverageTestTwo() {
        assertEquals(4, scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
    }

    @Test
    void scoresAverageTestThree() {
        assertEquals(4, scoresAverage(new int[]{3, 4, 5, 1, 2, 3}));
    }
}