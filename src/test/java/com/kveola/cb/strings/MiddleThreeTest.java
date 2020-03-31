package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.MiddleThree.middleThree;
import static org.junit.jupiter.api.Assertions.*;

class MiddleThreeTest {

    @Test
    void middleThreeTestOne() {
        assertEquals("and", middleThree("Candy"));
    }

    @Test
    void middleThreeTestTwo() {
        assertEquals("and", middleThree("and"));
    }

    @Test
    void middleThreeTestThree() {
        assertEquals("lvi", middleThree("solving"));
    }
}