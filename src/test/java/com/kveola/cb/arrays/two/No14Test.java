package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.No14.no14;
import static org.junit.jupiter.api.Assertions.*;

class No14Test {

    @Test
    void no14TestOne() {
        assertTrue(no14(new int[]{1, 2, 3}));
    }

    @Test
    void no14TestTwo() {
        assertFalse(no14(new int[]{1, 2, 3, 4}));
    }

    @Test
    void no14TestThree() {
        assertTrue(no14(new int[]{2, 3, 4}));
    }
}