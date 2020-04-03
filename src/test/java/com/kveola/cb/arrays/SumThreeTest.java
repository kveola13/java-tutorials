package com.kveola.cb.arrays;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.SumThree.sum3;
import static org.junit.jupiter.api.Assertions.*;

class SumThreeTest {

    @Test
    void sum3TestOne() {
        assertEquals(6, sum3(new int[]{1, 2, 3}));
    }

    @Test
    void sum3TestTwo() {
        assertEquals(18, sum3(new int[]{5, 11, 2}));
    }

    @Test
    void sum3TestThree() {
        assertEquals(7, sum3(new int[]{7, 0, 0}));
    }
}