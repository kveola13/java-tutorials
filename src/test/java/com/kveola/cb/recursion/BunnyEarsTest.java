package com.kveola.cb.recursion;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.recursion.BunnyEars.bunnyEars;
import static org.junit.jupiter.api.Assertions.*;

class BunnyEarsTest {

    @Test
    void bunnyEarsTestOne() {
        assertEquals(0, bunnyEars(0));
    }

    @Test
    void bunnyEarsTestTwo() {
        assertEquals(2, bunnyEars(1));
    }

    @Test
    void bunnyEarsTestThree() {
        assertEquals(4, bunnyEars(2));
    }
}