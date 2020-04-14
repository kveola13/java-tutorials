package com.kveola.cb.logic.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.two.CloseFar.closeFar;
import static org.junit.jupiter.api.Assertions.*;

class CloseFarTest {

    @Test
    void closeFarTestOne() {
        assertTrue(closeFar(1, 2, 10));
    }

    @Test
    void closeFarTestTwo() {
        assertFalse(closeFar(1, 2, 3));
    }

    @Test
    void closeFarTestThree() {
        assertTrue(closeFar(4, 1, 3));
    }
}