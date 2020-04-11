package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.LastDigit.lastDigit;
import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {

    @Test
    void lastDigitTestOne() {
        assertTrue(lastDigit(23, 19, 13));
    }

    @Test
    void lastDigitTestTwo() {
        assertFalse(lastDigit(23, 19, 12));
    }

    @Test
    void lastDigitTestThree() {
        assertTrue(lastDigit(23, 19, 3));
    }
}