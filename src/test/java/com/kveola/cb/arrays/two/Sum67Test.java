package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.Sum67.sum67;
import static org.junit.jupiter.api.Assertions.*;

class Sum67Test {

    @Test
    void sum67TestOne() {
        assertEquals(5, sum67(new int[]{1, 2, 2}));
    }

    @Test
    void sum67TestTwo() {
        assertEquals(5, sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));
    }

    @Test
    void sum67TestThree() {
        assertEquals(4, sum67(new int[]{1, 1, 6, 7, 2}));
    }
}