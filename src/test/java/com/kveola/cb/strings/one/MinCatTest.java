package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.MinCat.minCat;
import static org.junit.jupiter.api.Assertions.*;

class MinCatTest {

    @Test
    void minCatTestOne() {
        assertEquals("loHi", minCat("Hello", "Hi"));
    }

    @Test
    void minCatTestTwo() {
        assertEquals("ellojava", minCat("Hello", "java"));
    }

    @Test
    void minCatTestThree() {
        assertEquals("javaello", minCat("java", "Hello"));
    }
}