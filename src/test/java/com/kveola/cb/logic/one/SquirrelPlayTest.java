package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.SquirrelPlay.squirrelPlay;
import static org.junit.jupiter.api.Assertions.*;

class SquirrelPlayTest {

    @Test
    void squirrelPlayTestOne() {
        assertTrue(squirrelPlay(70, false));
    }

    @Test
    void squirrelPlayTestTwo() {
        assertFalse(squirrelPlay(95, false));
    }

    @Test
    void squirrelPlayTestThree() {
        assertTrue(squirrelPlay(95, true));
    }
}