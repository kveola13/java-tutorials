package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.FrontOneOne.front11;
import static org.junit.jupiter.api.Assertions.*;

class FrontOneOneTest {

    @Test
    void front11TestOne() {
        assertArrayEquals(new int[]{1, 7}, front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}));
    }

    @Test
    void front11TestTwo() {
        assertArrayEquals(new int[]{1, 2}, front11(new int[]{1}, new int[]{2}));
    }

    @Test
    void front11TestThree() {
        assertArrayEquals(new int[]{1}, front11(new int[]{1,7}, new int[]{}));
    }
}