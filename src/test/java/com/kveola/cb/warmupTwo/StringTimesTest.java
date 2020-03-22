package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTimesTest {

    @Test
    void stringTimesTestOne() {
        assertEquals("HiHi", StringTimes.stringTimes("Hi", 2));
    }
    @Test
    void stringTimesTestTwo() {
        assertEquals("HiHiHi", StringTimes.stringTimes("Hi", 3));
    }
    @Test
    void stringTimesTestThree() {
        assertEquals("Hi", StringTimes.stringTimes("Hi", 1));
    }
}