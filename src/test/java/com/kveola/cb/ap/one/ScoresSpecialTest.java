package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.ScoresSpecial.scoresSpecial;
import static org.junit.jupiter.api.Assertions.*;

class ScoresSpecialTest {

    @Test
    void scoresSpecialTestOne() {
        assertEquals(40, scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}));
    }

    @Test
    void scoresSpecialTestTwo() {
        assertEquals(40, scoresSpecial(new int[]{20, 10, 4}, new int[]{2, 20, 10}));
    }

    @Test
    void scoresSpecialTestThree() {
        assertEquals(20, scoresSpecial(new int[]{12, 11, 4}, new int[]{2, 20, 31}));
    }
}