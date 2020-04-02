package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.WithoutTwo.without2;
import static org.junit.jupiter.api.Assertions.*;

class WithoutTwoTest {

    @Test
    void without2TestOne() {
        assertEquals("lloHe", without2("HelloHe"));
    }

    @Test
    void without2TestTwo() {
        assertEquals("HelloHi", without2("HelloHi"));
    }

    @Test
    void without2TestThree() {
        assertEquals("", without2("Hi"));
    }
}