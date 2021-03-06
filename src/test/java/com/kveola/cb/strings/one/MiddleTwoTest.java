package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.MiddleTwo.middleTwo;
import static org.junit.jupiter.api.Assertions.*;

class MiddleTwoTest {

    @Test
    void middleTwoTestOne() {
        assertEquals("ri", middleTwo("string"));
    }
    @Test
    void middleTwoTestTwo() {
        assertEquals("od", middleTwo("code"));
    }
    @Test
    void middleTwoTestThree() {
        assertEquals("ct", middleTwo("Practice"));
    }
}