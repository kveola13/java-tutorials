package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.CaughtSpeeding.caughtSpeeding;
import static org.junit.jupiter.api.Assertions.*;

class CaughtSpeedingTest {

    @Test
    void caughtSpeedingTestOne() {
        assertEquals(0, caughtSpeeding(60, false));
    }

    @Test
    void caughtSpeedingTestTwo() {
        assertEquals(1, caughtSpeeding(65, false));
    }

    @Test
    void caughtSpeedingTestThree() {
        assertEquals(0, caughtSpeeding(65, true));
    }

    @Test
    void caughtSpeedingTestFour() {
        assertEquals(1, caughtSpeeding(85, true));
    }
}