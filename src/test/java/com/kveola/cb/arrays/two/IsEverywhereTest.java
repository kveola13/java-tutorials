package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.IsEverywhere.isEverywhere;
import static org.junit.jupiter.api.Assertions.*;

class IsEverywhereTest {

    @Test
    void isEverywhereTestOne() {
        assertTrue(isEverywhere(new int[]{1, 2, 1, 3}, 1));
    }

    @Test
    void isEverywhereTestTwo() {
        assertFalse(isEverywhere(new int[]{1, 2, 1, 3}, 2));
    }

    @Test
    void isEverywhereTestThree() {
        assertFalse(isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
    }
}