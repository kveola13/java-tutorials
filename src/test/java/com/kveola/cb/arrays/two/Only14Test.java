package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.Only14.only14;
import static org.junit.jupiter.api.Assertions.*;

class Only14Test {

    @Test
    void only14TestOne() {
        assertTrue(only14(new int[]{1, 4, 1, 4}));
    }

    @Test
    void only14TestTwo() {
        assertFalse(only14(new int[]{1, 4, 2, 4}));
    }

    @Test
    void only14TestThree() {
        assertTrue(only14(new int[]{1, 1}));
    }
}