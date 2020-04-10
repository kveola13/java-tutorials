package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.TeenSum.teenSum;
import static org.junit.jupiter.api.Assertions.*;

class TeenSumTest {

    @Test
    void teenSumTestOne() {
        assertEquals(7, teenSum(3, 4));
    }
    @Test
    void teenSumTestTwo() {
        assertEquals(19, teenSum(10, 13));
    }
    @Test
    void teenSumTestThree() {
        assertEquals(19, teenSum(13, 2));
    }
}