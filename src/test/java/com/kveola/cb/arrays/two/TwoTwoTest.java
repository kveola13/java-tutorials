package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.TwoTwo.twoTwo;
import static org.junit.jupiter.api.Assertions.*;

class TwoTwoTest {

    @Test
    void twoTwoTestOne() {
        assertTrue(twoTwo(new int[]{4, 2, 2, 3}));
    }

    @Test
    void twoTwoTestTwo() {
        assertTrue(twoTwo(new int[]{2, 2, 4}));
    }

    @Test
    void twoTwoTestThree() {
        assertFalse(twoTwo(new int[]{2, 2, 4, 2}));
    }
}