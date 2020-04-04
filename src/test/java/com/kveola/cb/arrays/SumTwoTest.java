package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.SumTwo.sum2;
import static org.junit.jupiter.api.Assertions.*;

class SumTwoTest {

    @Test
    void sum2TestOne() {
        assertEquals(3, sum2(new int[]{1, 2, 3}));
    }

    @Test
    void sum2TestTwo() {
        assertEquals(2, sum2(new int[]{1, 1}));
    }

    @Test
    void sum2TestThree() {
        assertEquals(2, sum2(new int[]{1, 1, 1, 1}));
    }
}