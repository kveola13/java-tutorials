package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.MaxModFive.maxMod5;
import static org.junit.jupiter.api.Assertions.*;

class MaxModFiveTest {

    @Test
    void maxMod5TestOne() {
        assertEquals(3, maxMod5(2, 3));
    }

    @Test
    void maxMod5TestTwo() {
        assertEquals(6, maxMod5(6, 2));
    }

    @Test
    void maxMod5TestThree() {
        assertEquals(3, maxMod5(3, 2));
    }
}