package com.kveola.cb.arrays.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.three.Fix45.fix45;
import static org.junit.jupiter.api.Assertions.*;

class Fix45Test {

    @Test
    void fix45TestOne() {
        assertArrayEquals(new int[]{9, 4, 5, 4, 5, 9}, fix45(new int[]{5, 4, 9, 4, 9, 5}));
    }

    @Test
    void fix45TestTwo() {
        assertArrayEquals(new int[]{1, 4, 5, 1}, fix45(new int[]{1, 4, 1, 5}));
    }

    @Test
    void fix45TestThree() {
        assertArrayEquals(new int[]{1, 4, 5, 1, 1, 4, 5}, fix45(new int[]{1, 4, 1, 5, 5, 4, 1}));
    }
}