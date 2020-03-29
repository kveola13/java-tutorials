package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.NonStart.nonStart;
import static org.junit.jupiter.api.Assertions.*;

class NonStartTest {

    @Test
    void nonStartTestOne() {
        assertEquals("ellohere", nonStart("Hello", "There"));
    }
    @Test
    void nonStartTestTwo() {
        assertEquals("avaode", nonStart("Java", "code"));
    }
    @Test
    void nonStartTestThree() {
        assertEquals("hotlava", nonStart("shotl", "java"));
    }
}