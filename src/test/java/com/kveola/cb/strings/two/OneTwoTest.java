package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.OneTwo.oneTwo;
import static org.junit.jupiter.api.Assertions.*;

class OneTwoTest {

    @Test
    void oneTwoTestOne() {
        assertEquals("bca", oneTwo("abc"));
    }

    @Test
    void oneTwoTestTwo() {
        assertEquals("cat", oneTwo("tca"));
    }

    @Test
    void oneTwoTestThree() {
        assertEquals("catdog", oneTwo("tcagdo"));
    }
}