package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.Has22.has22;
import static org.junit.jupiter.api.Assertions.*;

class Has22Test {

    @Test
    void has22TestOne() {
        assertTrue(has22(new int[]{1, 2, 2}));
    }

    @Test
    void has22TestTwo() {
        assertFalse(has22(new int[]{1, 2, 1, 2}));
    }

    @Test
    void has22TestThree() {
        assertFalse(has22(new int[]{2, 1, 2}));
    }
}