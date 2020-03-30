package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.NTwice.nTwice;
import static org.junit.jupiter.api.Assertions.*;

class NTwiceTest {

    @Test
    void nTwiceTestOne() {
        assertEquals("Helo", nTwice("Hello", 2));
    }
    @Test
    void nTwiceTestTwo() {
        assertEquals("Choate", nTwice("Chocolate", 3));
    }
    @Test
    void nTwiceTestThree() {
        assertEquals("Ce", nTwice("Chocolate", 1));
    }
}