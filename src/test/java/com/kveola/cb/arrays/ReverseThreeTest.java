package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.ReverseThree.reverse3;
import static org.junit.jupiter.api.Assertions.*;

class ReverseThreeTest {

    @Test
    void reverse3TestOne() {
        assertArrayEquals(new int[]{3, 2, 1}, reverse3(new int[]{1, 2, 3}));
    }

    @Test
    void reverse3TestTwo() {
        assertArrayEquals(new int[]{9, 11, 5}, reverse3(new int[]{5, 11, 9}));
    }

    @Test
    void reverse3TestThree() {
        assertArrayEquals(new int[]{0, 0, 7}, reverse3(new int[]{7, 0, 0}));
    }
}