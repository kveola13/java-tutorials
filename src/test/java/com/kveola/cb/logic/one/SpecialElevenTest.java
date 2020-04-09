package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.SpecialEleven.specialEleven;
import static org.junit.jupiter.api.Assertions.*;

class SpecialElevenTest {

    @Test
    void specialElevenTestOne() {
        assertTrue(specialEleven(22));
    }

    @Test
    void specialElevenTestTwo() {
        assertTrue(specialEleven(23));
    }

    @Test
    void specialElevenTestThree() {
        assertFalse(specialEleven(24));
    }
}