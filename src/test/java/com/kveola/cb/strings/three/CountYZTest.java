package com.kveola.cb.strings.three;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.three.CountYZ.countYZ;
import static org.junit.jupiter.api.Assertions.*;

class CountYZTest {

    @Test
    void countYZTestOne() {
        assertEquals(2, countYZ("fez day"));
    }

    @Test
    void countYZTestTwo() {
        assertEquals(2, countYZ("day fez"));
    }

    @Test
    void countYZTestThree() {
        assertEquals(2, countYZ("day fyyyz"));
    }

    @Test
    void countYZTestFour() {
        assertEquals(2, countYZ("y2bz"));
    }
}