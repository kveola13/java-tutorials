package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.LastChars.lastChars;
import static org.junit.jupiter.api.Assertions.*;

class LastCharsTest {

    @Test
    void lastCharsTestOne() {
        assertEquals("ls", lastChars("last", "chars"));
    }
    @Test
    void lastCharsTestTwo() {
        assertEquals("ya", lastChars("yo", "java"));
    }
    @Test
    void lastCharsTestThree() {
        assertEquals("h@", lastChars("hi", ""));
    }
}