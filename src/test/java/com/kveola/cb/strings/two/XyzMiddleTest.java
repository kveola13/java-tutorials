package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.XyzMiddle.xyzMiddle;
import static org.junit.jupiter.api.Assertions.*;

class XyzMiddleTest {

    @Test
    void xyzMiddleTestOne() {
        assertTrue(xyzMiddle("AAxyzBB"));
    }

    @Test
    void xyzMiddleTestTwo() {
        assertTrue(xyzMiddle("AxyzBB"));
    }

    @Test
    void xyzMiddleTestThree() {
        assertFalse(xyzMiddle("AxyzBBB"));
    }
}