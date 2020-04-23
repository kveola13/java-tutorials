package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.Sum13.sum13;
import static org.junit.jupiter.api.Assertions.*;

class Sum13Test {

    @Test
    void sum13TestOne() {
        assertEquals(6, sum13(new int[]{1, 2, 2, 1}));
    }

    @Test
    void sum13TestTwo() {
        assertEquals(2, sum13(new int[]{1, 1}));
    }

    @Test
    void sum13TestThree() {
        assertEquals(6, sum13(new int[]{1, 2, 2, 1, 13}));
    }
}