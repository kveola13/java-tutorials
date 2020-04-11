package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.LessByTen.lessBy10;
import static org.junit.jupiter.api.Assertions.*;

class LessByTenTest {

    @Test
    void lessBy10TestOne() {
        assertTrue(lessBy10(1, 7, 11));
    }

    @Test
    void lessBy10TestTwo() {
        assertFalse(lessBy10(1, 7, 10));
    }

    @Test
    void lessBy10TestThree() {
        assertTrue(lessBy10(11, 1, 7));
    }
}