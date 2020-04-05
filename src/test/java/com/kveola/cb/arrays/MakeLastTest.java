package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.MakeLast.makeLast;
import static org.junit.jupiter.api.Assertions.*;

class MakeLastTest {

    @Test
    void makeLastTestOne() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 6}, makeLast(new int[]{4, 5, 6}));
    }

    @Test
    void makeLastTestTwo() {
        assertArrayEquals(new int[]{0, 0, 0, 2}, makeLast(new int[]{1, 2}));
    }

    @Test
    void makeLastTestThree() {
        assertArrayEquals(new int[]{0, 3}, makeLast(new int[]{3}));
    }
}