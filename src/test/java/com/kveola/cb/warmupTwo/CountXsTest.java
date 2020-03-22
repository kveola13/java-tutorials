package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.CountXs.countXX;
import static org.junit.jupiter.api.Assertions.*;

class CountXsTest {

    @Test
    void countXXTestOne() {
        assertEquals(1, countXX("abcxx"));
    }
    @Test
    void countXXTestTwo() {
        assertEquals(2, countXX("xxx"));
    }
    @Test
    void countXXTestThree() {
        assertEquals(3, countXX("xxxx"));
    }
}