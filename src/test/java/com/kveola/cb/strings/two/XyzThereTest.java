package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.XyzThere.xyzThere;
import static org.junit.jupiter.api.Assertions.*;

class XyzThereTest {

    @Test
    void xyzThereTestOne() {
        assertTrue(xyzThere("abcxyz"));
    }

    @Test
    void xyzThereTestTwo() {
        assertFalse(xyzThere("abc.xyz"));
    }

    @Test
    void xyzThereTestThree() {
        assertTrue(xyzThere("xyz.abc"));
    }
}