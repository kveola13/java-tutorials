package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.SortaSum.sortaSum;
import static org.junit.jupiter.api.Assertions.*;

class SortaSumTest {

    @Test
    void sortaSumTestOne() {
        assertEquals(7, sortaSum(3, 4));
    }

    @Test
    void sortaSumTestTwo() {
        assertEquals(20, sortaSum(9, 4));
    }

    @Test
    void sortaSumTestThree() {
        assertEquals(21, sortaSum(10, 11));
    }
}