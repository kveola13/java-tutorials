package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.TwoAsOne.twoAsOne;
import static org.junit.jupiter.api.Assertions.*;

class TwoAsOneTest {

    @Test
    void twoAsOneTestOne() {
        assertTrue(twoAsOne(1, 2, 3));
    }

    @Test
    void twoAsOneTestTwo() {
        assertTrue(twoAsOne(3, 1, 2));
    }

    @Test
    void twoAsOneTestThree() {
        assertFalse(twoAsOne(3, 2, 2));
    }
}