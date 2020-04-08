package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.LoveSix.love6;
import static org.junit.jupiter.api.Assertions.*;

class LoveSixTest {

    @Test
    void love6TestOne() {
        assertTrue(love6(6, 4));
    }

    @Test
    void love6TestTwo() {
        assertFalse(love6(4, 5));
    }

    @Test
    void love6TestThree() {
        assertTrue(love6(1, 5));
    }
}