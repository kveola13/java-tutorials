package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.CatDog.catDog;
import static org.junit.jupiter.api.Assertions.*;

class CatDogTest {

    @Test
    void catDogTestOne() {
        assertTrue(catDog("catdog"));
    }

    @Test
    void catDogTestTwo() {
        assertFalse(catDog("catcat"));
    }

    @Test
    void catDogTestThree() {
        assertTrue(catDog("1cat1cadodog"));
    }
}