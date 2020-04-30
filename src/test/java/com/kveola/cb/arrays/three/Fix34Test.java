package com.kveola.cb.arrays.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.three.Fix34.fix34;
import static org.junit.jupiter.api.Assertions.*;

class Fix34Test {

    @Test
    void fix34TestOne() {
        assertArrayEquals(new int[]{1, 3, 4, 1}, fix34(new int[]{1, 3, 1, 4}));
    }

    @Test
    void fix34TestTwo() {
        assertArrayEquals(new int[]{1, 3, 4, 1, 1, 3, 4}, fix34(new int[]{1, 3, 1, 4, 4, 3, 1}));
    }

    @Test
    void fix34TestThree() {
        assertArrayEquals(new int[]{3, 4, 2, 2}, fix34(new int[]{3, 2, 2, 4}));
    }
}