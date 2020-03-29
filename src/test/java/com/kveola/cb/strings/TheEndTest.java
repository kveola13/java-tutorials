package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.TheEnd.theEnd;
import static org.junit.jupiter.api.Assertions.*;

class TheEndTest {

    @Test
    void theEndTestOne() {
        assertEquals("H", theEnd("Hello", true));
    }
    @Test
    void theEndTestTwo() {
        assertEquals("o", theEnd("Hello", false));
    }
    @Test
    void theEndTestThree() {
        assertEquals("o", theEnd("oh", true));
    }
}