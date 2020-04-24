package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.Sum28.sum28;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Sum28Test {

    @Test
    void sum28TestOne() {
        assertTrue(sum28(new int[]{2, 3, 2, 2, 4, 2}));
    }

    @Test
    void sum28TestTwo() {
        assertFalse(sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
    }

    @Test
    void sum28TestThree() {
        assertFalse(sum28(new int[]{1, 2, 3, 4}));
    }
}