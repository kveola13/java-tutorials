package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.ConCat.conCat;
import static org.junit.jupiter.api.Assertions.*;

class ConCatTest {

    @Test
    void conCatTestOne() {
        assertEquals("abcat", conCat("abc", "cat"));
    }

    @Test
    void conCatTestTwo() {
        assertEquals("dogcat", conCat("dog", "cat"));
    }

    @Test
    void conCatTestThree() {
        assertEquals("abc", conCat("abc", ""));
    }
}