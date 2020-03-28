package com.kveola.cb.strings;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.FirstTwo.firstTwo;
import static org.junit.jupiter.api.Assertions.*;

class FirstTwoTest {

    @Test
    void firstTwoTestOne() {
        assertEquals("He", firstTwo("Hello"));
    }
    @Test
    void firstTwoTestTwo() {
        assertEquals("ab", firstTwo("abcdefg"));
    }
    @Test
    void firstTwoTestThree() {
        assertEquals("ab", firstTwo("ab"));
    }
}