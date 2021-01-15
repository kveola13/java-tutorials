package com.kveola.cb.warmupOne;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupOne.PrintEveryX.everyNth;
import static org.junit.jupiter.api.Assertions.*;

class PrintEveryXTest {

    @Test
    void everyNthTestOne() {
        assertEquals("Mrce", everyNth("Miracle", 2));
    }

    @Test
    void everyNthTestTwo() {
        assertEquals("aceg", everyNth("abcdefg", 2));
    }

    @Test
    void everyNthTestThree() {
        assertEquals("adg", everyNth("abcdefg", 3));
    }
}