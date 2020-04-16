package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.CountCode.countCode;
import static org.junit.jupiter.api.Assertions.*;

class CountCodeTest {

    @Test
    void countCodeTestOne() {
        assertEquals(1, countCode("aaacodebbb"));
    }

    @Test
    void countCodeTestTwo() {
        assertEquals(2, countCode("codexxcode"));
    }

    @Test
    void countCodeTestThree() {
        assertEquals(2, countCode("cozexxcope"));
    }
}