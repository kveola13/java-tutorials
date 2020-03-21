package com.kveola.cb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripleETest {

    @Test
    void stringETestOne() {
        assertTrue(TripleE.stringE("Hello"));
    }
    @Test
    void stringETestTwo() {
        assertTrue(TripleE.stringE("Heelle"));
    }
    @Test
    void stringETestThree() {
        assertFalse(TripleE.stringE("Heelele"));
    }
    @Test
    void stringETestFour() {
        assertTrue(TripleE.stringE("e"));
    }
}