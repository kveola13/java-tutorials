package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.CountHi.countHi;
import static org.junit.jupiter.api.Assertions.*;

class CountHiTest {

    @Test
    void countHiTestOne() {
        assertEquals(1, countHi("abc hi ho"));
    }

    @Test
    void countHiTestTwo() {
        assertEquals(2, countHi("ABChi hi"));
    }

    @Test
    void countHiTestThree() {
        assertEquals(2, countHi("hihi"));
    }
}