package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.HasOne.hasOne;
import static org.junit.jupiter.api.Assertions.*;

class HasOneTest {

    @Test
    void hasOneTestOne() {
        assertTrue(hasOne(10));
    }
    @Test
    void hasOneTestTwo() {
        assertFalse(hasOne(22));
    }
    @Test
    void hasOneTestThree() {
        assertFalse(hasOne(220));
    }
}