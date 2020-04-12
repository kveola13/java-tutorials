package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.SumLimit.sumLimit;
import static org.junit.jupiter.api.Assertions.*;

class SumLimitTest {

    @Test
    void sumLimitTestOne() {
        assertEquals(5, sumLimit(2, 3));
    }

    @Test
    void sumLimitTestTwo() {
        assertEquals(8, sumLimit(8, 3));
    }

    @Test
    void sumLimitTestThree() {
        assertEquals(9, sumLimit(8, 1));
    }
}