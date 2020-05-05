package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.SumHeights2.sumHeights2;
import static org.junit.jupiter.api.Assertions.*;

class SumHeights2Test {

    @Test
    void sumHeights2TestOne() {
        assertEquals(7, sumHeights2(new int[]{5, 3, 6, 7, 2}, 2, 4));
    }

    @Test
    void sumHeights2TestTwo() {
        assertEquals(2, sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 1));
    }

    @Test
    void sumHeights2TestThree() {
        assertEquals(15, sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }
}