package com.kveola.cb.logic.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.two.LoneSum.loneSum;
import static org.junit.jupiter.api.Assertions.*;

class LoneSumTest {

    @Test
    void loneSumTestOne() {
        assertEquals(6, loneSum(1, 2, 3));
    }

    @Test
    void loneSumTestTwo() {
        assertEquals(2, loneSum(3, 2, 3));
    }

    @Test
    void loneSumTestThree() {
        assertEquals(0, loneSum(3, 3, 3));
    }
}