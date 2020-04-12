package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.ShareDigit.shareDigit;
import static org.junit.jupiter.api.Assertions.*;

class ShareDigitTest {

    @Test
    void shareDigitTestOne() {
        assertTrue(shareDigit(12, 23));
    }

    @Test
    void shareDigitTestTwo() {
        assertFalse(shareDigit(12, 43));
    }

    @Test
    void shareDigitTestThree() {
        assertFalse(shareDigit(12, 44));
    }
}