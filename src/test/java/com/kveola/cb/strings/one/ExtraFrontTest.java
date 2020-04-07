package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.ExtraFront.extraFront;
import static com.kveola.cb.strings.one.ExtraFront.extraFrontAlt;
import static org.junit.jupiter.api.Assertions.*;

class ExtraFrontTest {

    @Test
    void extraFrontTestOne() {
        assertEquals("HeHeHe", extraFront("Hello"));
    }

    @Test
    void extraFrontTestTwo() {
        assertEquals("ababab", extraFront("ab"));
    }

    @Test
    void extraFrontTestThree() {
        assertEquals("HHH", extraFront("H"));
    }

    @Test
    void extraFrontAltTestOne() {
        assertEquals("HeHeHe", extraFrontAlt("Hello"));
    }

    @Test
    void extraFrontAltTestTwo() {
        assertEquals("ababab", extraFrontAlt("ab"));
    }

    @Test
    void extraFrontAltTestThree() {
        assertEquals("HHH", extraFrontAlt("H"));
    }
}