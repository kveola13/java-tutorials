package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.XyBalance.xyBalance;
import static org.junit.jupiter.api.Assertions.*;

class XyBalanceTest {

    @Test
    void xyBalanceTestOne() {
        assertTrue(xyBalance("aaxbby"));
    }

    @Test
    void xyBalanceTestTwo() {
        assertFalse(xyBalance("aaxbb"));
    }

    @Test
    void xyBalanceTestThree() {
        assertFalse(xyBalance("yaaxbb"));
    }
}