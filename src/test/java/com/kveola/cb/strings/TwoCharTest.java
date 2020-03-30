package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.TwoChar.twoChar;
import static org.junit.jupiter.api.Assertions.*;

class TwoCharTest {

    @Test
    void twoCharTestOne() {
        assertEquals("ja", twoChar("java", 0));
    }
    @Test
    void twoCharTestTwo() {
        assertEquals("va", twoChar("java", 2));
    }
    @Test
    void twoCharTestThree() {
        assertEquals("ja", twoChar("java", 3));
    }
    @Test
    void twoCharTestFour() {
        assertEquals("ja", twoChar("java", -1));
    }
    @Test
    void twoCharTestFive() {
        assertEquals("He", twoChar("Hello", -7));
    }
    @Test
    void twoCharTestSix() {
        assertEquals("He", twoChar("Hello", -1));
    }
}