package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.RepeatFront.repeatFront;
import static org.junit.jupiter.api.Assertions.*;

class RepeatFrontTest {

    @Test
    void repeatFrontTestOne() {
        assertEquals("ChocChoChC", repeatFront("Chocolate", 4));
    }

    @Test
    void repeatFrontTestTwo() {
        assertEquals("ChoChC", repeatFront("Chocolate", 3));
    }

    @Test
    void repeatFrontTestThree() {
        assertEquals("IcI", repeatFront("Ice Cream", 2));
    }
}