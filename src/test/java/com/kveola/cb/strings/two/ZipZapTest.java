package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.ZipZap.zipZap;
import static org.junit.jupiter.api.Assertions.*;

class ZipZapTest {

    @Test
    void zipZapTestOne() {
        assertEquals("zpXzp", zipZap("zipXzap"));
    }
    @Test
    void zipZapTestTwo() {
        assertEquals("zpXzp", zipZap("zipXzap"));
    }
    @Test
    void zipZapTestThree() {
        assertEquals("zpXzp", zipZap("zipXzap"));
    }
}