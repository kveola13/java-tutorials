package com.kveola.cb.arrays.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.one.MakeTwo.make2;
import static com.kveola.cb.arrays.one.MakeTwo.make2Alt;
import static org.junit.jupiter.api.Assertions.*;

class MakeTwoTest {

    @Test
    void make2TestOne() {
        assertArrayEquals(new int[]{4, 5}, make2(new int[]{4, 5}, new int[]{1, 2, 3}));
    }

    @Test
    void make2TestTwo() {
        assertArrayEquals(new int[]{4, 1}, make2(new int[]{4}, new int[]{1, 2, 3}));
    }

    @Test
    void make2TestThree() {
        assertArrayEquals(new int[]{1, 2}, make2(new int[]{}, new int[]{1, 2}));
    }
    @Test
    void make2AltTestOne() {
        assertArrayEquals(new int[]{4, 5}, make2Alt(new int[]{4, 5}, new int[]{1, 2, 3}));
    }

    @Test
    void make2AltTestTwo() {
        assertArrayEquals(new int[]{4, 1}, make2Alt(new int[]{4}, new int[]{1, 2, 3}));
    }

    @Test
    void make2AltTestThree() {
        assertArrayEquals(new int[]{1, 2}, make2Alt(new int[]{}, new int[]{1, 2}));
    }
}