package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.LastTwo.last2;
import static org.junit.jupiter.api.Assertions.*;

class LastTwoTest {

    @Test
    void last2TestOne() {
        assertEquals(1, last2("hixxhi"));
    }
    @Test
    void last2TestTwo() {
        assertEquals(1, last2("xaxxaxaxx"));
    }
    @Test
    void last2TestThree() {
        assertEquals(2, last2("axxxaaxx"));
    }
}