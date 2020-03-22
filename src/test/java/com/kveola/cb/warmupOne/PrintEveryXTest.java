package com.kveola.cb.warmupOne;

import com.kveola.cb.warmupOne.PrintEveryX;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintEveryXTest {

    @Test
    void everyNthTestOne() {
        assertEquals("Mrce", PrintEveryX.everyNth("Miracle", 2));
    }

    @Test
    void everyNthTestTwo() {
        assertEquals("aceg", PrintEveryX.everyNth("abcdefg", 2));
    }

    @Test
    void everyNthTestThree() {
        assertEquals("adg", PrintEveryX.everyNth("abcdefg", 3));
    }
}