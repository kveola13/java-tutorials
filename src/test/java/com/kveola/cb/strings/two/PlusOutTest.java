package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.PlusOut.plusOut;
import static org.junit.jupiter.api.Assertions.*;

class PlusOutTest {

    @Test
    void plusOutTestOne() {
        assertEquals("++xy++", plusOut("12xy34", "xy"));
    }

    @Test
    void plusOutTestTwo() {
        assertEquals("1+++++", plusOut("12xy34", "1"));
    }

    @Test
    void plusOutTestThree() {
        assertEquals("++xy++xy+++xy", plusOut("12xy34xyabcxy", "xy"));
    }
}