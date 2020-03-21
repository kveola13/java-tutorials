package com.kveola.cb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperLastTest {

    @Test
    void endUpTestOne() {
        assertEquals("HeLLO", UpperLast.endUp("Hello"));
    }

    @Test
    void endUpTestTwo() {
        assertEquals("hi thERE", UpperLast.endUp("hi there"));
    }

    @Test
    void endUpTestThree() {
        assertEquals("HI", UpperLast.endUp("hi"));
    }

    @Test
    void endUpTestFour() {
        assertEquals("HeLLO", UpperLast.endUp("Hello"));
    }
}