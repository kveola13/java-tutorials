package com.kveola.cb.strings.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.one.FirstHalf.firstHalf;
import static org.junit.jupiter.api.Assertions.*;

class FirstHalfTest {

    @Test
    void firstHalfTestOne() {
        assertEquals("Woo", firstHalf("WooHoo"));
    }
    @Test
    void firstHalfTestTwo() {
        assertEquals("Hello", firstHalf("HelloThere"));
    }
    @Test
    void firstHalfTestThree() {
        assertEquals("abc", firstHalf("abcdef"));
    }
}