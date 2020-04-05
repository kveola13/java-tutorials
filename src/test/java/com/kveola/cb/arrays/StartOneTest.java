package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.StartOne.start1;
import static org.junit.jupiter.api.Assertions.*;

class StartOneTest {

    @Test
    void start1TestOne() {
        assertEquals(2, start1(new int[]{1, 2, 3}, new int[]{1, 3}));
    }

    @Test
    void start1TestTwo() {
        assertEquals(1, start1(new int[]{7, 2, 3}, new int[]{1}));
    }

    @Test
    void start1TestThree() {
        assertEquals(1, start1(new int[]{1, 2}, new int[]{}));
    }
}