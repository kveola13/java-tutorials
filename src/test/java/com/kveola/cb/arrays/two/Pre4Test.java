package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.Pre4.pre4;
import static org.junit.jupiter.api.Assertions.*;

class Pre4Test {

    @Test
    void pre4TestOne() {
        assertArrayEquals(new int[]{1, 2}, pre4(new int[]{1, 2, 4, 1}));
    }

    @Test
    void pre4TestTwo() {
        assertArrayEquals(new int[]{3, 1}, pre4(new int[]{3, 1, 4}));
    }

    @Test
    void pre4TestThree() {
        assertArrayEquals(new int[]{1}, pre4(new int[]{1, 4, 4,}));
    }
}