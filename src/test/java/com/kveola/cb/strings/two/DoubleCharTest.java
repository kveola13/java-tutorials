package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.DoubleChar.doubleChar;
import static org.junit.jupiter.api.Assertions.*;

class DoubleCharTest {

    @Test
    void doubleCharTestOne() {
        assertEquals("TThhee", doubleChar("The"));
    }

    @Test
    void doubleCharTestTwo() {
        assertEquals("AAAAbbbb", doubleChar("AAbb"));
    }

    @Test
    void doubleCharTestThree() {
        assertEquals("HHii--TThheerree", doubleChar("Hi-There"));
    }
}