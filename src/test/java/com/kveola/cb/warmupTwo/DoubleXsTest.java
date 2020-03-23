package com.kveola.cb.warmupTwo;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.warmupTwo.DoubleXs.altDoubleX;
import static com.kveola.cb.warmupTwo.DoubleXs.doubleX;
import static org.junit.jupiter.api.Assertions.*;

class DoubleXsTest {

    @Test
    void doubleXTestOne() {
        assertTrue(doubleX("axxbb"));
    }
    @Test
    void doubleXTestTwo(){
        assertFalse(doubleX("axaxax"));
    }
    @Test
    void doubleXTestThree() {
        assertTrue(doubleX("xxxxx"));
    }
    @Test
    void altDoubleXTestOne() {
        assertTrue(altDoubleX("axxbb"));
    }
    @Test
    void altDoubleXTestTwo(){
        assertFalse(altDoubleX("axaxax"));
    }
    @Test
    void altDoubleXTestThree() {
        assertTrue(altDoubleX("xxxxx"));
    }
    @Test
    void altDoubleXTestFour(){
        assertFalse(altDoubleX(""));
    }
}