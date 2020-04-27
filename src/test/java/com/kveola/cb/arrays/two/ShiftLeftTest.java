package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.ShiftLeft.shiftLeft;
import static org.junit.jupiter.api.Assertions.*;

class ShiftLeftTest {

    @Test
    void shiftLeftTestOne() {
        assertArrayEquals(new int[]{2, 5, 3, 6}, shiftLeft(new int[]{6, 2, 5, 3}));
    }

    @Test
    void shiftLeftTestTwo() {
        assertArrayEquals(new int[]{2, 1}, shiftLeft(new int[]{1, 2}));
    }

    @Test
    void shiftLeftTestThree() {
        assertArrayEquals(new int[]{1}, shiftLeft(new int[]{1}));
    }
}