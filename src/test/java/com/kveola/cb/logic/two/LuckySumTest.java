package com.kveola.cb.logic.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.two.LuckySum.luckySum;
import static org.junit.jupiter.api.Assertions.*;

class LuckySumTest {

    @Test
    void luckySumTestOne() {
        assertEquals(6, luckySum(1, 2, 3));
    }

    @Test
    void luckySumTestTwo() {
        assertEquals(3, luckySum(1, 2, 13));
    }

    @Test
    void luckySumTestThree() {
        assertEquals(1, luckySum(1, 13, 3));
    }
}