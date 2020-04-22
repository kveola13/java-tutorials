package com.kveola.cb.arrays.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.one.RotateLeftThree.rotateLeft3;
import static org.junit.jupiter.api.Assertions.*;

class RotateLeftThreeTest {

    @Test
    void rotateLeft3TestOne() {
        assertArrayEquals(new int[]{2, 3, 1}, rotateLeft3(new int[]{1, 2, 3}));
    }

    @Test
    void rotateLeft3TestTwo() {
        assertArrayEquals(new int[]{11, 9, 5}, rotateLeft3(new int[]{5, 11, 9}));
    }

    @Test
    void rotateLeft3TestThree() {
        assertArrayEquals(new int[]{0, 0, 7}, rotateLeft3(new int[]{7, 0, 0}));
    }
}