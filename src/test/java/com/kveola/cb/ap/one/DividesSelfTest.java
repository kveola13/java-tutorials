package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.DividesSelf.dividesSelf;
import static org.junit.jupiter.api.Assertions.*;

class DividesSelfTest {

    @Test
    void dividesSelfTestOne() {
        assertTrue(dividesSelf(128));
    }

    @Test
    void dividesSelfTestTwo() {
        assertTrue(dividesSelf(12));
    }

    @Test
    void dividesSelfTestThree() {
        assertFalse(dividesSelf(120));
    }
}