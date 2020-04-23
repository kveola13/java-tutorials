package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.CenteredAverage.centeredAverage;
import static org.junit.jupiter.api.Assertions.*;

class CenteredAverageTest {

    @Test
    void centeredAverageTestOne() {
        assertEquals(3, centeredAverage(new int[]{1, 2, 3, 4, 100}));
    }

    @Test
    void centeredAverageTestTwo() {
        assertEquals(5, centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
    }

    @Test
    void centeredAverageTestThree() {
        assertEquals(-3, centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }
}