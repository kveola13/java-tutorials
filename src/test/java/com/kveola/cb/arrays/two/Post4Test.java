package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.Post4.post4;
import static org.junit.jupiter.api.Assertions.*;

class Post4Test {

    @Test
    void post4TestOne() {
        assertArrayEquals(new int[]{1, 2}, post4(new int[]{2, 4, 1, 2}));
    }

    @Test
    void post4TestTwo() {
        assertArrayEquals(new int[]{2}, post4(new int[]{4, 1, 4, 2}));
    }

    @Test
    void post4TestThree() {
        assertArrayEquals(new int[]{1, 2, 3}, post4(new int[]{4, 4, 1, 2, 3}));
    }
}