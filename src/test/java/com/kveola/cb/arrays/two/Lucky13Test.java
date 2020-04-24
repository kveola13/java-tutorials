package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.Lucky13.lucky13;
import static org.junit.jupiter.api.Assertions.*;

class Lucky13Test {

    @Test
    void lucky13TestOne() {
        assertTrue(lucky13(new int[]{0, 2, 4}));
    }

    @Test
    void lucky13TestTwo() {
        assertFalse(lucky13(new int[]{1, 2, 3}));
    }

    @Test
    void lucky13TestThree() {
        assertFalse(lucky13(new int[]{1, 2, 4}));
    }
}