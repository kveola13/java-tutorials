package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.StringYak.stringYak;
import static org.junit.jupiter.api.Assertions.*;

class StringYakTest {

    @Test
    void stringYakTestOne() {
        assertEquals("pak", stringYak("yakpak"));
    }
    @Test
    void stringYakTestTwo() {
        assertEquals("pak", stringYak("pakyak"));
    }
    @Test
    void stringYakTestThree() {
        assertEquals("123ya", stringYak("yak123ya"));
    }
}