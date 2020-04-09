package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.OldThirtyFive.old35;
import static org.junit.jupiter.api.Assertions.*;

class OldThirtyFiveTest {

    @Test
    void old35TestOne() {
        assertTrue(old35(3));
    }

    @Test
    void old35TestTwo() {
        assertTrue(old35(10));
    }

    @Test
    void old35TestThree() {
        assertFalse(old35(15));
    }
}