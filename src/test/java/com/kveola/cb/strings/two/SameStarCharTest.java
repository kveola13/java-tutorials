package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.SameStarChar.sameStarChar;
import static org.junit.jupiter.api.Assertions.*;

class SameStarCharTest {

    @Test
    void sameStarCharTestOne() {
        assertTrue(sameStarChar("xy*yzz"));
    }

    @Test
    void sameStarCharTestTwo() {
        assertFalse(sameStarChar("xy*zzz"));
    }

    @Test
    void sameStarCharTestThree() {
        assertTrue(sameStarChar("*xa*az"));
    }
}