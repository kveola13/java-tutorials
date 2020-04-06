package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.PlusTwo.plusTwo;
import static com.kveola.cb.arrays.PlusTwo.plusTwoAlt;
import static org.junit.jupiter.api.Assertions.*;

class PlusTwoTest {

    @Test
    void plusTwoTestOne() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, plusTwo(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    void plusTwoTestTwo() {
        assertArrayEquals(new int[]{4, 4, 2, 2}, plusTwo(new int[]{4, 4}, new int[]{2, 2}));
    }

    @Test
    void plusTwoTestThree() {
        assertArrayEquals(new int[]{9, 2, 3, 4}, plusTwo(new int[]{9, 2}, new int[]{3, 4}));
    }
    @Test
    void plusTwoAltTestOne() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, plusTwoAlt(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    void plusTwoAltTestTwo() {
        assertArrayEquals(new int[]{4, 4, 2, 2}, plusTwoAlt(new int[]{4, 4}, new int[]{2, 2}));
    }

    @Test
    void plusTwoAltTestThree() {
        assertArrayEquals(new int[]{9, 2, 3, 4}, plusTwoAlt(new int[]{9, 2}, new int[]{3, 4}));
    }
}