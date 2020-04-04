package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.MakeEnds.makeEnds;
import static org.junit.jupiter.api.Assertions.*;

class MakeEndsTest {

    @Test
    void makeEndsTestOne() {
        assertArrayEquals(new int[]{1, 3}, makeEnds(new int[]{1, 2, 3}));
    }

    @Test
    void makeEndsTestTwo() {
        assertArrayEquals(new int[]{1, 4}, makeEnds(new int[]{1, 2, 3, 4}));
    }

    @Test
    void makeEndsTestThree() {
        assertArrayEquals(new int[]{7, 2}, makeEnds(new int[]{7, 4, 6, 2}));
    }
}