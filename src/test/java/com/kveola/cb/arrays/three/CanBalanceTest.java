package com.kveola.cb.arrays.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.three.CanBalance.canBalance;
import static org.junit.jupiter.api.Assertions.*;

class CanBalanceTest {

    @Test
    void canBalanceTestOne() {
        assertTrue(canBalance(new int[]{1, 1, 1, 2, 1}));
    }

    @Test
    void canBalanceTestTwo() {
        assertFalse(canBalance(new int[]{2, 1, 1, 2, 1}));
    }

    @Test
    void canBalanceTestThree() {
        assertTrue(canBalance(new int[]{10, 10}));
    }
}