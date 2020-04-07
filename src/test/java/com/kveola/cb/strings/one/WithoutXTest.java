package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.WithoutX.withoutX;
import static com.kveola.cb.strings.one.WithoutX.withoutX2;
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
    @Test
    void withoutX2TestOne() {
        assertEquals("Hi", withoutX2("xHi"));
    }

    @Test
    void withoutX2TestTwo() {
        assertEquals("Hi", withoutX2("Hxi"));
    }

    @Test
    void withoutX2TestThree() {
        assertEquals("Hi", withoutX2("Hi"));
    }
}