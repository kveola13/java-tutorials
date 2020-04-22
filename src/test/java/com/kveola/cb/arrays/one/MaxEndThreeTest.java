package com.kveola.cb.arrays.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.one.MaxEndThree.maxEnd3;
import static org.junit.jupiter.api.Assertions.*;

class MaxEndThreeTest {

    @Test
    void maxEnd3TestOne() {
        assertArrayEquals(new int[]{3, 3, 3}, maxEnd3(new int[]{1, 2, 3}));
    }

    @Test
    void maxEnd3TestTwo() {
        assertArrayEquals(new int[]{11, 11, 11}, maxEnd3(new int[]{5, 11, 9}));
    }

    @Test
    void maxEnd3TestThree() {
        assertArrayEquals(new int[]{7, 7, 7}, maxEnd3(new int[]{7, 0, 0}));
    }
}