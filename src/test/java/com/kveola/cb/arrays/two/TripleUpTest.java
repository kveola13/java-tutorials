package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.TripleUp.tripleUp;
import static org.junit.jupiter.api.Assertions.*;

class TripleUpTest {

    @Test
    void tripleUpTestOne() {
        assertTrue(tripleUp(new int[]{1, 4, 5, 6, 2}));
    }

    @Test
    void tripleUpTestTwo() {
        assertTrue(tripleUp(new int[]{1, 2, 3}));
    }

    @Test
    void tripleUpTestThree() {
        assertFalse(tripleUp(new int[]{1, 2, 4}));
    }
}