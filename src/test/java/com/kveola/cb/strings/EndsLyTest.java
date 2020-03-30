package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.EndsLy.endsLy;
import static org.junit.jupiter.api.Assertions.*;

class EndsLyTest {

    @Test
    void endsLyTestOne() {
        assertTrue(endsLy("oddly"));
    }
    @Test
    void endsLyTestTwo() {
        assertFalse(endsLy("y"));
    }
    @Test
    void endsLyTestThree() {
        assertFalse(endsLy("oddy"));
    }
}