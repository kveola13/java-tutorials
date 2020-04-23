package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.CountEvens.countEvens;
import static org.junit.jupiter.api.Assertions.*;

class CountEvensTest {

    @Test
    void countEvensTestOne() {
        assertEquals(3, countEvens(new int[]{2, 1, 2, 3, 4}));
    }

    @Test
    void countEvensTestTwo() {
        assertEquals(3, countEvens(new int[]{2, 2, 0}));
    }

    @Test
    void countEvensTestThree() {
        assertEquals(0, countEvens(new int[]{1, 3, 5}));
    }
}