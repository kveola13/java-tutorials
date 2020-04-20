package com.kveola.cb.strings.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.three.CountTriple.countTriple;
import static org.junit.jupiter.api.Assertions.*;

class CountTripleTest {

    @Test
    void countTripleTestOne() {
        assertEquals(1, countTriple("abcXXXabc"));
    }
    @Test
    void countTripleTestTwo() {
        assertEquals(3, countTriple("xxxabyyyycd"));
    }
    @Test
    void countTripleTestThree() {
        assertEquals(0, countTriple("a"));
    }

    @Test
    void countTripleTestFour() {
        assertEquals(3, countTriple("222abyyycdXXX"));
    }
}