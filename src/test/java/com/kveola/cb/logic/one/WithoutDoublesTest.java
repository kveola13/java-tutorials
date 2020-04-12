package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.WithoutDoubles.withoutDoubles;
import static org.junit.jupiter.api.Assertions.*;

class WithoutDoublesTest {

    @Test
    void withoutDoublesTestOne() {
        assertEquals(5, withoutDoubles(2, 3, true));
    }

    @Test
    void withoutDoublesTestTwo() {
        assertEquals(7, withoutDoubles(3, 3, true));
    }

    @Test
    void withoutDoublesTestThree() {
        assertEquals(6, withoutDoubles(3, 3, false));
    }
}