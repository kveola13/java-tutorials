package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.InOneToTen.in1To10;
import static org.junit.jupiter.api.Assertions.*;

class InOneToTenTest {

    @Test
    void in1To10TestOne() {
        assertTrue(in1To10(5, false));
    }

    @Test
    void in1To10TestTwo() {
        assertFalse(in1To10(11, false));
    }

    @Test
    void in1To10TestThree() {
        assertTrue(in1To10(11, true));
    }
}