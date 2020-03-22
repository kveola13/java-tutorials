package com.kveola.cb.warmupOne;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupOne.IntMax.intMax;
import static org.junit.jupiter.api.Assertions.*;

class IntMaxTest {

    @Test
    void assertTest() {
        assertEquals(intMax(1, 2, 3), 3);
    }

    @Test
    void assertSecondTest() {
        assertEquals(intMax(1, 3, 2), 3);
    }

    @Test
    void assertThirdTest() {
        assertEquals(intMax(3, 2, 1), 3);
    }
}