package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.StringX.stringX;
import static org.junit.jupiter.api.Assertions.*;

class StringXTest {

    @Test
    void stringXTestOne() {
        assertEquals("xHix", stringX("xxHxix"));
    }
    @Test
    void stringXTestTwo() {
        assertEquals("abcd", stringX("abxxxcd"));
    }
    @Test
    void stringXTestThree() {
        assertEquals("xabcdx", stringX("xabxxxcdx"));
    }
}