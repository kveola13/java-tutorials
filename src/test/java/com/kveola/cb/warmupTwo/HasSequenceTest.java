package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.HasSequence.has271;
import static org.junit.jupiter.api.Assertions.*;

class HasSequenceTest {

    @Test
    void has271TestOne() {
        assertTrue(has271(new int[]{1, 2, 7, 1}));
    }
    @Test
    void has271TestTwo() {
        assertFalse(has271(new int[]{1, 2, 8, 1}));
    }
    @Test
    void has271TestThree() {
        assertTrue(has271(new int[]{2, 7, 1}));
    }
}