package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.NotAlone.notAlone;
import static org.junit.jupiter.api.Assertions.*;

class NotAloneTest {

    @Test
    void notAloneTestOne() {
        assertArrayEquals(new int[]{1, 3, 3}, notAlone(new int[]{1, 2, 3}, 2));
    }

    @Test
    void notAloneTestTwo() {
        assertArrayEquals(new int[]{1, 3, 3, 5, 5, 2}, notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2));
    }

    @Test
    void notAloneTestThree() {
        assertArrayEquals(new int[]{3, 4}, notAlone(new int[]{3, 4}, 3));
    }

    @Test
    void notAloneTestFour() {
        assertArrayEquals(new int[]{1, 1, 1, 2}, notAlone(new int[]{1, 1, 1, 2}, 1));
    }
}