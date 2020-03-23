package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.StringBits.stringBits;
import static org.junit.jupiter.api.Assertions.*;

class StringBitsTest {

    @Test
    void stringBitsTestOne() {
        assertEquals("Hlo", stringBits("Hello"));
    }
    @Test
    void stringBitsTestTwo() {
        assertEquals("H", stringBits("Hi"));
    }
    @Test
    void stringBitsTestThree() {
        assertEquals("Hello", stringBits("Heeololeo"));
    }
}