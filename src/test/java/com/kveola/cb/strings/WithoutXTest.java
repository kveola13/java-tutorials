package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.WithoutX.withoutX;
import static org.junit.jupiter.api.Assertions.*;

class WithoutXTest {

    @Test
    void withoutXTestOne() {
        assertEquals("Hi", withoutX("xHix"));
    }

    @Test
    void withoutXTestTwo() {
        assertEquals("Hi", withoutX("xHi"));
    }

    @Test
    void withoutXTestThree() {
        assertEquals("Hxi", withoutX("Hxix"));
    }
}