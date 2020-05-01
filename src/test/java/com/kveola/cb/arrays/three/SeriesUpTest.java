package com.kveola.cb.arrays.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.three.SeriesUp.seriesUp;
import static org.junit.jupiter.api.Assertions.*;

class SeriesUpTest {

    @Test
    void seriesUpTestOne() {
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3}, seriesUp(3));
    }

    @Test
    void seriesUpTestTwo() {
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}, seriesUp(4));
    }

    @Test
    void seriesUpTestThree() {
        assertArrayEquals(new int[]{1, 1, 2}, seriesUp(2));
    }
}