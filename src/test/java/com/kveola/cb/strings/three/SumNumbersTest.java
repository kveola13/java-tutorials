package com.kveola.cb.strings.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.three.SumNumbers.sumNumbers;
import static org.junit.jupiter.api.Assertions.*;

class SumNumbersTest {

    @Test
    void sumNumbersTestOne() {
        assertEquals(123, sumNumbers("abc123xyz"));
    }
    @Test
    void sumNumbersTestTwo() {
        assertEquals(44, sumNumbers("aa11b33"));
    }
    @Test
    void sumNumbersTestThree() {
        assertEquals(18, sumNumbers("7 11"));
    }
}