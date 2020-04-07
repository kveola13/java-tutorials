package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.DeFront.deFront;
import static org.junit.jupiter.api.Assertions.*;

class DeFrontTest {

    @Test
    void deFrontTestOne() {
        assertEquals("llo", deFront("Hello"));
    }

    @Test
    void deFrontTestTwo() {
        assertEquals("va", deFront("java"));
    }

    @Test
    void deFrontTestThree() {
        assertEquals("aay", deFront("away"));
    }
}