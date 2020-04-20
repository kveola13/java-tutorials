package com.kveola.cb.strings.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.three.EqualIsNot.equalIsNot;
import static org.junit.jupiter.api.Assertions.*;

class EqualIsNotTest {

    @Test
    void equalIsNotTestOne() {
        assertFalse(equalIsNot("This is not"));
    }

    @Test
    void equalIsNotTestTwo() {
        assertTrue(equalIsNot("This is notnot"));
    }

    @Test
    void equalIsNotTestThree() {
        assertTrue(equalIsNot("noisxxnotyynotxisi"));
    }
}