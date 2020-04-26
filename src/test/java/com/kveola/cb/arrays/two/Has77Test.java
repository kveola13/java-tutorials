package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.Has77.has77;
import static org.junit.jupiter.api.Assertions.*;

class Has77Test {

    @Test
    void has77TestOne() {
        assertTrue(has77(new int[]{1, 7, 7}));
    }

    @Test
    void has77TestTwo() {
        assertTrue(has77(new int[]{1, 7, 1, 7}));
    }

    @Test
    void has77TestThree() {
        assertFalse(has77(new int[]{1, 7, 1, 1, 7}));
    }

    @Test
    void has77TestFour(){
        assertFalse(has77(new int[]{2, 7, 2, 2, 7, 2}));
    }
}