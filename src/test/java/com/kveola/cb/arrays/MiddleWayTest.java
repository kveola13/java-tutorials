package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.MiddleWay.middleWay;
import static org.junit.jupiter.api.Assertions.*;

class MiddleWayTest {

    @Test
    void middleWayTestOne() {
        assertArrayEquals(new int[]{2, 5}, middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    @Test
    void middleWayTestTwo() {
        assertArrayEquals(new int[]{7, 8}, middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}));
    }

    @Test
    void middleWayTestThree() {
        assertArrayEquals(new int[]{2, 4}, middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5}));
    }
}