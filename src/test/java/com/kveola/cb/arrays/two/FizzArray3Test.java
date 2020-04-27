package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.FizzArray3.fizzArray3;
import static org.junit.jupiter.api.Assertions.*;

class FizzArray3Test {

    @Test
    void fizzArray3TestOne() {
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, fizzArray3(5, 10));
    }

    @Test
    void fizzArray3TestTwo() {
        assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17}, fizzArray3(11, 18));
    }

    @Test
    void fizzArray3TestThree() {
        assertArrayEquals(new int[]{1, 2}, fizzArray3(1, 3));
    }
}