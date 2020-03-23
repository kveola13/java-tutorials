package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.StringExplode.stringSplosion;
import static org.junit.jupiter.api.Assertions.*;

class StringExplodeTest {

    @Test
    void stringSplosionTestOne() {
        assertEquals("CCoCodCode", stringSplosion("Code"));
    }
    @Test
    void stringSplosionTestTwo() {
        assertEquals("aababc", stringSplosion("abc"));
    }
    @Test
    void stringSplosionTestThree() {
        assertEquals("aab", stringSplosion("ab"));
    }
}