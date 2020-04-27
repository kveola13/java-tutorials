package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.TenRun.tenRun;
import static org.junit.jupiter.api.Assertions.*;

class TenRunTest {

    @Test
    void tenRunTestOne() {
        assertArrayEquals(new int[]{2, 10, 10, 10, 20, 20},
                tenRun(new int[]{2, 10, 3, 4, 20, 5}));
    }

    @Test
    void tenRunTestTwo() {
        assertArrayEquals(new int[]{10, 10, 20, 20},
                tenRun(new int[]{10, 1, 20, 2}));
    }

    @Test
    void tenRunTestThree() {
        assertArrayEquals(new int[]{10, 10, 10, 20},
                tenRun(new int[]{10, 1, 9, 20}));
    }
}