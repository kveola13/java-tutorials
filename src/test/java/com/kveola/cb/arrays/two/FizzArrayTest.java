package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.FizzArray.fizzArray;
import static org.junit.jupiter.api.Assertions.*;

class FizzArrayTest {

    @Test
    void fizzArrayTestOne() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, fizzArray(4));
    }

    @Test
    void fizzArrayTestTwo() {
        assertArrayEquals(new int[]{0}, fizzArray(1));
    }

    @Test
    void fizzArrayTestThree() {
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, fizzArray(10));
    }
}