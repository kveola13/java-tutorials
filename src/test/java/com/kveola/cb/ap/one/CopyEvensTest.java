package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.CopyEvens.copyEvens;
import static org.junit.jupiter.api.Assertions.*;

class CopyEvensTest {

    @Test
    void copyEvensTestOne() {
        assertArrayEquals(new int[]{2, 4}, copyEvens(new int[]{3, 2, 4, 5, 8}, 2));
    }

    @Test
    void copyEvensTestTwo() {
        assertArrayEquals(new int[]{2, 4, 8}, copyEvens(new int[]{3, 2, 4, 5, 8}, 3));
    }

    @Test
    void copyEvensTestThree() {
        assertArrayEquals(new int[]{6, 2, 4}, copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 3));
    }
}