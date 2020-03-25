package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.ArraySixSixSeven.array667;
import static org.junit.jupiter.api.Assertions.*;

class ArraySixSixSevenTest {

    @Test
    void array667TestOne() {
        assertEquals(1, array667(new int[]{6, 6, 2}));
    }

    @Test
    void array667TestTwo() {
        assertEquals(1, array667(new int[]{6, 6, 2, 6}));
    }

    @Test
    void array667TestThree() {
        assertEquals(1, array667(new int[]{6, 7, 2, 6}));
    }
}