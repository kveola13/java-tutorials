package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.WithoutTen.withoutTen;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class WithoutTenTest {

    @Test
    void withoutTenTestOne() {
        assertArrayEquals(new int[]{1, 2, 0, 0}, withoutTen(new int[]{1, 10, 10, 2}));
    }

    @Test
    void withoutTenTestTwo() {
        assertArrayEquals(new int[]{2, 0, 0}, withoutTen(new int[]{10, 2, 10}));
    }

    @Test
    void withoutTenTestThree() {
        assertArrayEquals(new int[]{1, 99, 0}, withoutTen(new int[]{1, 99, 10}));
    }
}