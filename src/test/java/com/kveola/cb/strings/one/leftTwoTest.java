package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.LeftTwo.left2;
import static org.junit.jupiter.api.Assertions.*;

class leftTwoTest {

    @Test
    void left2TestOne() {
        assertEquals("lloHe", left2("Hello"));
    }

    @Test
    void left2TestTwo() {
        assertEquals("vaja", left2("java"));
    }

    @Test
    void left2TestThree() {
        assertEquals("Hi", left2("Hi"));
    }
}