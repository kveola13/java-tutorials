package com.kveola.cb.warmupOne;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupOne.SleepIn.sleepIn;
import static org.junit.jupiter.api.Assertions.*;

class SleepInTest {

    @Test
    void sleepInOne() {
        assertTrue(sleepIn(false,false));
    }

    @Test
    void sleepInTwo() {
        assertFalse(sleepIn(true,false));
    }

    @Test
    void sleepInThree() {
        assertTrue(sleepIn(false,true));
    }
}