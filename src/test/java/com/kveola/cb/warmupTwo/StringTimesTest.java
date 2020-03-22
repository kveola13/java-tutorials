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
        assertEquals("codecode", StringTimes.stringTimes("code", 2));
    }
    @Test
    void stringTimesTestFour() {
        assertEquals("Hi", StringTimes.stringTimes("Hi", 1));
    }
    @Test
    void stringTimesTestFive() {
        assertEquals("", StringTimes.stringTimes("Hi", 0));
    }
    @Test
    void stringTimesTestSix() {
        assertEquals("HiHiHiHiHi", StringTimes.stringTimes("Hi", 5));
    }
    @Test
    void stringTimesTestSeven() {
        assertEquals("Oh Boy!Oh Boy!", StringTimes.stringTimes("Oh Boy!", 2));
    }
    @Test
    void stringTimesTestEight() {
        assertEquals("xxxx", StringTimes.stringTimes("x", 4));
    }
    @Test
    void stringTimesTestNine() {
        assertEquals("", StringTimes.stringTimes("", 4));
    }
    @Test
    void stringTimesTestTen() {
        assertEquals("codecodecode", StringTimes.stringTimes("code", 3));
    }
}