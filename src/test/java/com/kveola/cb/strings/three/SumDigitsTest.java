package com.kveola.cb.strings.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.three.SumDigits.sumDigits;
import static org.junit.jupiter.api.Assertions.*;

class SumDigitsTest {

    @Test
    void sumDigitsTestOne() {
        assertEquals(6, sumDigits("aa1bc2d3"));
    }

    @Test
    void sumDigitsTestTwo() {
        assertEquals(8, sumDigits("aa11b33"));
    }

    @Test
    void sumDigitsTestThree() {
        assertEquals(0, sumDigits("Chocolate"));
    }
}