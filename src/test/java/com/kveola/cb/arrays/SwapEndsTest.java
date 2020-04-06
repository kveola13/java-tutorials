package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.SwapEnds.swapEnds;
import static org.junit.jupiter.api.Assertions.*;

class SwapEndsTest {

    @Test
    void swapEndsTestOne() {
        assertArrayEquals(new int[]{4, 2, 3, 1}, swapEnds(new int[]{1, 2, 3, 4}));
    }

    @Test
    void swapEndsTestTwo() {
        assertArrayEquals(new int[]{3, 2, 1}, swapEnds(new int[]{1, 2, 3}));
    }

    @Test
    void swapEndsTestThree() {
        assertArrayEquals(new int[]{5, 6, 7, 9, 8}, swapEnds(new int[]{8, 6, 7, 9, 5}));
    }
}