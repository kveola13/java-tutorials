package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.PrefixAgain.prefixAgain;
import static org.junit.jupiter.api.Assertions.*;

class PrefixAgainTest {

    @Test
    void prefixAgainTestOne() {
        assertTrue(prefixAgain("abXYabc", 1));
    }

    @Test
    void prefixAgainTestTwo() {
        assertTrue(prefixAgain("abXYabc", 2));
    }

    @Test
    void prefixAgainTestThree() {
        assertFalse(prefixAgain("abXYabc", 3));
    }
}