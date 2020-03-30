package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.WithoutEnd.withouEnd2;
import static com.kveola.cb.strings.WithoutEnd.withoutEnd;
import static org.junit.jupiter.api.Assertions.*;

class WithoutEndTest {

    @Test
    void withoutEndTestOne() {
        assertEquals("ell", withoutEnd("Hello"));
    }

    @Test
    void withoutEndTestTwo() {
        assertEquals("av", withoutEnd("Java"));
    }

    @Test
    void withoutEndTestThree() {
        assertEquals("odin", withoutEnd("Coding"));
    }

    @Test
    void withoutEnd2TestOne() {
        assertEquals("ell", withouEnd2("Hello"));
    }

    @Test
    void withoutEnd2TestTwo() {
        assertEquals("b", withouEnd2("abc"));
    }

    @Test
    void withoutEnd2TestThree() {
        assertEquals("", withouEnd2("ab"));
    }
}