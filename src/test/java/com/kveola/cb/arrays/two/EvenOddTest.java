package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.EvenOdd.evenOdd;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void evenOddTestOne() {
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 1}, evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}));
    }

    @Test
    void evenOddTestTwo() {
        assertArrayEquals(new int[]{2, 3, 3}, evenOdd(new int[]{3, 3, 2}));
    }

    @Test
    void evenOddTestThree() {
        assertArrayEquals(new int[]{2, 2, 2}, evenOdd(new int[]{2, 2, 2}));
    }
}