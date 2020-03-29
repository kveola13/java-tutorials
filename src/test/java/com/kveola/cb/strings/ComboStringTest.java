package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.ComboString.comboString;
import static org.junit.jupiter.api.Assertions.*;

class ComboStringTest {

    @Test
    void comboStringTestOne() {
        assertEquals("hiHellohi", comboString("Hello", "hi"));
    }

    @Test
    void comboStringTestTwo() {
        assertEquals("hiHellohi", comboString("hi", "Hello"));
    }

    @Test
    void comboStringTestThree() {
        assertEquals("baaab", comboString("aaa", "b"));
    }
}