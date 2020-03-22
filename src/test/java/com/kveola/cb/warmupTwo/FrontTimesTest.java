package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.FrontTimes.frontTimes;
import static org.junit.jupiter.api.Assertions.*;

class FrontTimesTest {

    @Test
    void frontTimesTestOne() {
        assertEquals("ChoCho", frontTimes("Chocolate", 2));
    }
    @Test
    void frontTimesTestTwo() {
        assertEquals("ChoChoCho", frontTimes("Chocolate", 3));
    }
    @Test
    void frontTimesTestFour() {
        assertEquals("AbcAbcAbc", frontTimes("Abc", 3));
    }
    @Test
    void frontTimesTestFive() {
        assertEquals("AbAbAbAb", frontTimes("Ab", 4));
    }
    @Test
    void frontTimesTestSix() {
        assertEquals("AAAA", frontTimes("A", 4));
    }
    @Test
    void frontTimesTestSeven() {
        assertEquals("", frontTimes("", 4));
    }
    @Test
    void frontTimesTestEight() {
        assertEquals("", frontTimes("Abc", 0));
    }
}