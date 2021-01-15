package com.kveola.cb.warmupOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumDoubleTest {

    @Test
    void sumDoubleOne() {
        assertEquals(3, SumDouble.sumDouble(1,2));
    }
    @Test
    void sumDoubleTwo() {
        assertEquals(5, SumDouble.sumDouble(3,2));
    }
    @Test
    void sumDoubleThree() {
        assertEquals(8, SumDouble.sumDouble(2,2));
    }
}