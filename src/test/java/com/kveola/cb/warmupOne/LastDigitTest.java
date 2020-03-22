package com.kveola.cb.warmupOne;

import com.kveola.cb.warmupOne.LastDigit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {

    @Test
    void lastDigitTestOne() {
        assertTrue(LastDigit.lastDigit(7, 17));
    }

    @Test
    void lastDigitTestTwo() {
        assertFalse(LastDigit.lastDigit(6, 17));
    }

    @Test
    void lastDigitTestThree() {
        assertTrue(LastDigit.lastDigit(3, 113));
    }

    @Test
    void lastDigitTestFour() {
        assertTrue(LastDigit.lastDigit(7, 17));
    }
}