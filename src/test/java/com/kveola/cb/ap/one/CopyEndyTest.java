package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.CopyEndy.copyEndy;
import static org.junit.jupiter.api.Assertions.*;

class CopyEndyTest {

    @Test
    void copyEndyTestOne() {
        assertArrayEquals(new int[]{9, 90}, copyEndy(new int[]{9, 11, 90, 22, 6}, 2));
    }

    @Test
    void copyEndyTestTwo() {
        assertArrayEquals(new int[]{9, 90, 6}, copyEndy(new int[]{9, 11, 90, 22, 6}, 3));
    }

    @Test
    void copyEndyTestThree() {
        assertArrayEquals(new int[]{1, 1}, copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 2));
    }
}