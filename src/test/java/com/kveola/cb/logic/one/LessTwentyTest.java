package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.LessTwenty.less20;
import static org.junit.jupiter.api.Assertions.*;

class LessTwentyTest {

    @Test
    void less20TestOne() {
        assertTrue(less20(18));
    }

    @Test
    void less20TestTwo() {
        assertTrue(less20(19));
    }

    @Test
    void less20TestThree() {
        assertFalse(less20(20));
    }
}