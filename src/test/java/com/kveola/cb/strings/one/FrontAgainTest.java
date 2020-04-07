package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.FrontAgain.frontAgain;
import static org.junit.jupiter.api.Assertions.*;

class FrontAgainTest {

    @Test
    void frontAgainTestOne() {
        assertTrue(frontAgain("edited"));
    }

    @Test
    void frontAgainTestTwo() {
        assertFalse(frontAgain("edit"));
    }

    @Test
    void frontAgainTestThree() {
        assertTrue(frontAgain("ed"));
    }
}