package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.InOrder.inOrder;
import static com.kveola.cb.logic.one.InOrder.inOrderEqual;
import static org.junit.jupiter.api.Assertions.*;

class InOrderTest {

    @Test
    void inOrderTestOne() {
        assertTrue(inOrder(1, 2, 4, false));
    }

    @Test
    void inOrderTestTwo() {
        assertFalse(inOrder(1, 2, 1, false));
    }

    @Test
    void inOrderTestThree() {
        assertTrue(inOrder(1, 1, 2, true));
    }

    @Test
    void inOrderEqualTestOne() {
        assertTrue(inOrderEqual(2, 5, 11, false));
    }

    @Test
    void inOrderEqualTestTwo() {
        assertFalse(inOrderEqual(5, 7, 6, false));
    }

    @Test
    void inOrderEqualTestThree() {
        assertTrue(inOrderEqual(5, 5, 7, true));
    }
}