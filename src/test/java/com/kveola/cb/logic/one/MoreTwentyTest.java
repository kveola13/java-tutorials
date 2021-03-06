package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.MoreTwenty.more20;
import static org.junit.jupiter.api.Assertions.*;

class MoreTwentyTest {

    @Test
    void more20TestOne() {
        assertFalse(more20(20));
    }

    @Test
    void more20TestTwo() {
        assertTrue(more20(21));
    }

    @Test
    void more20TestThree() {
        assertTrue(more20(22));
    }
}