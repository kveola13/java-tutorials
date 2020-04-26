package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.HaveThree.haveThree;
import static org.junit.jupiter.api.Assertions.*;

class HaveThreeTest {

    @Test
    void haveThreeTestOne() {
        assertTrue(haveThree(new int[]{3, 1, 3, 1, 3}));
    }

    @Test
    void haveThreeTestTwo() {
        assertFalse(haveThree(new int[]{3, 1, 3, 3}));
    }

    @Test
    void haveThreeTestThree() {
        assertFalse(haveThree(new int[]{3, 4, 3, 3, 4}));
    }

    @Test
    void haveThreeTestFour() {
        assertFalse(haveThree(new int[]{1, 3, 1, 3, 1, 3, 4, 3}));
    }

    @Test
    void haveThreeTestFive() {
        assertTrue(haveThree(new int[]{1, 3, 1, 3, 1, 3}));
    }

    @Test
    void haveThreeTestSix() {
        assertFalse(haveThree(new int[]{1, 3, 3, 1, 3}));
    }
}