package com.kveola.cb.strings.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.strings.two.GetSandwich.getSandwich;
import static org.junit.jupiter.api.Assertions.*;

class GetSandwichTest {

    @Test
    void getSandwichTestOne() {
        assertEquals("jam", getSandwich("breadjambread"));
    }

    @Test
    void getSandwichTestTwo() {
        assertEquals("jam", getSandwich("xxbreadjambreadyy"));
    }

    @Test
    void getSandwichTestThree() {
        assertEquals("", getSandwich("xxbreadyy"));
    }
}