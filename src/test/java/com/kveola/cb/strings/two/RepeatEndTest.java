package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.RepeatEnd.repeatEnd;
import static com.kveola.cb.strings.two.RepeatEnd.repeatEndAlt;
import static org.junit.jupiter.api.Assertions.*;

class RepeatEndTest {

    @Test
    void repeatEndTestOne() {
        assertEquals("llollollo", repeatEnd("Hello", 3));
    }

    @Test
    void repeatEndTestTwo() {
        assertEquals("lolo", repeatEnd("Hello", 2));
    }

    @Test
    void repeatEndTestThree() {
        assertEquals("o", repeatEnd("Hello", 1));
    }

    @Test
    void repeatEndAltTestOne() {
        assertEquals("llollollo", repeatEndAlt("Hello", 3));
    }

    @Test
    void repeatEndAltTestTwo() {
        assertEquals("lolo", repeatEndAlt("Hello", 2));
    }

    @Test
    void repeatEndAltTestThree() {
        assertEquals("o", repeatEndAlt("Hello", 1));
    }
}