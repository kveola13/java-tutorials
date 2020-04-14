package com.kveola.cb.logic.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.two.NoTeenSum.noTeenSum;
import static org.junit.jupiter.api.Assertions.*;

class NoTeenSumTest {

    @Test
    void noTeenSumTestOne() {
        assertEquals(6, noTeenSum(1, 2, 3));
    }

    @Test
    void noTeenSumTestTwo() {
        assertEquals(3, noTeenSum(2, 13, 1));
    }

    @Test
    void noTeenSumTestThree() {
        assertEquals(3, noTeenSum(2, 1, 14));
    }
}