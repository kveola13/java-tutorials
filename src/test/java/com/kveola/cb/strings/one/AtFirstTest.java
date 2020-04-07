package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.AtFirst.atFirst;
import static com.kveola.cb.strings.one.AtFirst.atFirstAlt;
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