package com.kveola.cb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirtyFiftyTest {

    @Test
    void thirtyFiftyTestOne() {
        assertTrue(ThirtyFifty.in3050(30, 31));
    }

    @Test
    void thirtyFiftyTestTwo() {
        assertFalse(ThirtyFifty.in3050(30, 41));
    }

    @Test
    void thirtyFiftyTestThree() {
        assertTrue(ThirtyFifty.in3050(40, 50));
    }
}