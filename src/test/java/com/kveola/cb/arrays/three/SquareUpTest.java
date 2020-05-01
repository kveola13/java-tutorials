package com.kveola.cb.arrays.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.three.SquareUp.squareUp;
import static org.junit.jupiter.api.Assertions.*;

class SquareUpTest {

    @Test
    void squareUpTestOne() {
        assertArrayEquals(new int[]{0, 0, 1, 0, 2, 1, 3, 2, 1}, squareUp(3));
    }

    @Test
    void squareUpTestTwo() {
        assertArrayEquals(new int[]{0, 1, 2, 1}, squareUp(2));
    }

    @Test
    void squareUpTestThree() {
        assertArrayEquals(new int[]{0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}, squareUp(4));
    }
}