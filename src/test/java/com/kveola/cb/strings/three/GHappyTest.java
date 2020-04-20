package com.kveola.cb.strings.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.three.GHappy.gHappy;
import static org.junit.jupiter.api.Assertions.*;

class GHappyTest {

    @Test
    void gHappyTestOne() {
        assertTrue(gHappy("xxggxx"));
    }

    @Test
    void gHappyTestTwo() {
        assertFalse(gHappy("xxgxx"));
    }

    @Test
    void gHappyTestThree() {
        assertFalse(gHappy("xxggyygxx"));
    }

    @Test
    void gHappyTestFour() {
        assertFalse(gHappy("g"));
    }

    @Test
    void gHappyTestFive() {
        assertFalse(gHappy("xxgggxyg"));
    }
}