package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.ModThree.modThree;
import static org.junit.jupiter.api.Assertions.*;

class ModThreeTest {

    @Test
    void modThreeTestOne() {
        assertTrue(modThree(new int[]{2, 1, 3, 5}));
    }

    @Test
    void modThreeTestTwo() {
        assertFalse(modThree(new int[]{2, 1, 2, 5}));
    }

    @Test
    void modThreeTestThree() {
        assertTrue(modThree(new int[]{2, 4, 2, 5}));
    }
}