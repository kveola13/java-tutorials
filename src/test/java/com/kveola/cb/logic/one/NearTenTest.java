package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.NearTen.nearTen;
import static org.junit.jupiter.api.Assertions.*;

class NearTenTest {

    @Test
    void nearTenTestOne() {
        assertTrue(nearTen(12));
    }

    @Test
    void nearTenTestTwo() {
        assertFalse(nearTen(17));
    }

    @Test
    void nearTenTestThree() {
        assertTrue(nearTen(19));
    }
}