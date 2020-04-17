package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.MixString.mixString;
import static org.junit.jupiter.api.Assertions.*;

class MixStringTest {

    @Test
    void mixStringTestOne() {
        assertEquals("axbycz", mixString("abc", "xyz"));
    }
    @Test
    void mixStringTestTwo() {
        assertEquals("HTihere", mixString("Hi", "There"));
    }
    @Test
    void mixStringTestThree() {
        assertEquals("xTxhxexre", mixString("xxxx", "There"));
    }
}