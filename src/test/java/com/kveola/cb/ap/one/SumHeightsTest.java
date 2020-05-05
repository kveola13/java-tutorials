package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.SumHeights.sumHeights;
import static org.junit.jupiter.api.Assertions.*;

class SumHeightsTest {

    @Test
    void sumHeightsTestOne() {
        assertEquals(6, sumHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));
    }

    @Test
    void sumHeightsTestTwo() {
        assertEquals(2, sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 1));
    }

    @Test
    void sumHeightsTestThree() {
        assertEquals(11, sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }
}