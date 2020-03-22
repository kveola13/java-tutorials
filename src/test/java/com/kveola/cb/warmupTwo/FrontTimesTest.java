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
    void frontTimesTestThree() {
        assertEquals("AbcAbcAbc", frontTimes("Abc", 3));
    }
}