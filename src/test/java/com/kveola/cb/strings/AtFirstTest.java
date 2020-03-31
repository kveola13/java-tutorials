package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.AtFirst.atFirst;
import static com.kveola.cb.strings.AtFirst.atFirstAlt;
import static org.junit.jupiter.api.Assertions.*;

class AtFirstTest {

    @Test
    void atFirstTestOne() {
        assertEquals("he", atFirst("hello"));
    }

    @Test
    void atFirstTestTwo() {
        assertEquals("hi", atFirst("hi"));
    }

    @Test
    void atFirstTestThree() {
        assertEquals("h@", atFirst("h"));
    }
    @Test
    void atFirstAltTestOne() {
        assertEquals("he", atFirstAlt("hello"));
    }

    @Test
    void atFirstAltTestTwo() {
        assertEquals("hi", atFirstAlt("hi"));
    }

    @Test
    void atFirstAltTestThree() {
        assertEquals("h@", atFirstAlt("h"));
    }
}