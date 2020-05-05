package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.BigHeights.bigHeights;
import static org.junit.jupiter.api.Assertions.*;

class BigHeightsTest {

    @Test
    void bigHeightsTestOne() {
        assertEquals(1, bigHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));
    }

    @Test
    void bigHeightsTestTwo() {
        assertEquals(0, bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 1));
    }

    @Test
    void bigHeightsTestThree() {
        assertEquals(1, bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }
}