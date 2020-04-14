package com.kveola.cb.logic.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.two.RoundSum.roundSum;
import static org.junit.jupiter.api.Assertions.*;

class RoundSumTest {

    @Test
    void roundSumTestOne() {
        assertEquals(60, roundSum(16, 17, 18));
    }

    @Test
    void roundSumTestTwo() {
        assertEquals(30, roundSum(12, 13, 14));
    }

    @Test
    void roundSumTestThree() {
        assertEquals(10, roundSum(6, 4, 4));
    }
}