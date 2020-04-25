package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.Either24.either24;
import static org.junit.jupiter.api.Assertions.*;

class Either24Test {

    @Test
    void either24TestOne() {
        assertTrue(either24(new int[]{1, 2, 2}));
    }

    @Test
    void either24TestTwo() {
        assertTrue(either24(new int[]{4, 4, 1}));
    }

    @Test
    void either24TestThree() {
        assertFalse(either24(new int[]{4, 4, 1, 2, 2}));
    }
}