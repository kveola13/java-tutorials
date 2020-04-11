package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.InOrder.inOrder;
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
}