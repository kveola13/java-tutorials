package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.More14.more14;
import static org.junit.jupiter.api.Assertions.*;

class More14Test {

    @Test
    void more14TestOne() {
        assertTrue(more14(new int[]{1, 4, 1}));
    }

    @Test
    void more14TestTwo() {
        assertFalse(more14(new int[]{1, 4, 2, 4}));
    }

    @Test
    void more14TestThree() {
        assertTrue(more14(new int[]{1, 1}));
    }
}