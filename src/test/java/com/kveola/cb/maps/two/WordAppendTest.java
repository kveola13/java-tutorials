package com.kveola.cb.maps.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.maps.two.WordAppend.wordAppend;
import static org.junit.jupiter.api.Assertions.*;

class WordAppendTest {

    @Test
    void WordAppendTestOne() {
        assertEquals("a", wordAppend(new String[]{"a", "b", "a"}));
    }

    @Test
    void WordAppendTestTwo() {
        assertEquals("aa", wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
    }

    @Test
    void WordAppendTestThree() {
        assertEquals("a", wordAppend(new String[]{"a", "", "a"}));
    }
}