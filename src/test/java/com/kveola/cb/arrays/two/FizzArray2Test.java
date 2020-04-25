package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.FizzArray2.fizzArray2;
import static org.junit.jupiter.api.Assertions.*;

class FizzArray2Test {

    @Test
    void fizzArray2TestOne() {
        assertArrayEquals(new String[]{"0", "1", "2", "3"}, fizzArray2(4));
    }

    @Test
    void fizzArray2TestTwo() {
        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}, fizzArray2(10));
    }

    @Test
    void fizzArray2TestThree() {
        assertArrayEquals(new String[]{"0", "1"}, fizzArray2(2));
    }
}