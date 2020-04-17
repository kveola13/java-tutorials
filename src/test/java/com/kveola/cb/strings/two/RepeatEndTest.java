package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.RepeatEnd.repeatEnd;
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
}