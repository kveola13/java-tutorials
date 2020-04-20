package com.kveola.cb.strings.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.three.WithoutString.withoutString;
import static org.junit.jupiter.api.Assertions.*;

class WithoutStringTest {

    @Test
    void withoutStringTestOne() {
        assertEquals("He there", withoutString("Hello there", "llo"));
    }
    @Test
    void withoutStringTestTwo() {
        assertEquals("Hllo thr", withoutString("Hello there", "e"));
    }
    @Test
    void withoutStringTestThree() {
        assertEquals("Hello there", withoutString("Hello there", "x"));
    }
}