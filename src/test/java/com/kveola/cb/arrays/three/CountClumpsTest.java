package com.kveola.cb.arrays.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.three.CountClumps.countClumps;
import static org.junit.jupiter.api.Assertions.*;

class CountClumpsTest {

    @Test
    void countClumpsTestOne() {
        assertEquals(2, countClumps(new int[]{1, 2, 2, 3, 4, 4}));
    }

    @Test
    void countClumpsTestTwo() {
        assertEquals(2, countClumps(new int[]{1, 1, 2, 1, 1}));
    }

    @Test
    void countClumpsTestThree() {
        assertEquals(1, countClumps(new int[]{1, 1, 1, 1, 1}));
    }
}