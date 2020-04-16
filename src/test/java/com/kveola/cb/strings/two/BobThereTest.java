package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.BobThere.bobThere;
import static org.junit.jupiter.api.Assertions.*;

class BobThereTest {

    @Test
    void bobThereTestOne() {
        assertTrue(bobThere("abcbob"));
    }

    @Test
    void bobThereTestTwo() {
        assertTrue(bobThere("b9b"));
    }

    @Test
    void bobThereTestThree() {
        assertFalse(bobThere("bac"));
    }
}