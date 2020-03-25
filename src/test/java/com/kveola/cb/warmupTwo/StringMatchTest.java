package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.StringMatch.stringMatch;
import static org.junit.jupiter.api.Assertions.*;

class StringMatchTest {

    @Test
    void stringMatchTestOne() {
        assertEquals(3, stringMatch("xxcaazz", "xxbaaz"));
    }
    @Test
    void stringMatchTestTwo() {
        assertEquals(2, stringMatch("abc", "abc"));
    }
    @Test
    void stringMatchTestThree() {
        assertEquals(0, stringMatch("abc", "axc"));
    }
}