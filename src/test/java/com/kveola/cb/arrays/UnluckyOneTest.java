package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.UnluckyOne.unlucky1;
import static org.junit.jupiter.api.Assertions.*;

class UnluckyOneTest {

    @Test
    void unlucky1TestOne() {
        assertTrue(unlucky1(new int[]{1, 3, 4, 5}));
    }

    @Test
    void unlucky1TestTwo() {
        assertTrue(unlucky1(new int[]{2, 1, 3, 4, 5}));
    }

    @Test
    void unlucky1TestThree() {
        assertFalse(unlucky1(new int[]{1, 1, 1}));
    }

    @Test
    void unlucky1TestFour() {
        assertFalse(unlucky1(new int[]{1, 1, 1, 3, 1}));
    }
}