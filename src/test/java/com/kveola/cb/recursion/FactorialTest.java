package com.kveola.cb.recursion;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.recursion.Factorial.factorial;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorialTestOne() {
        assertEquals(1, factorial(1));
    }

    @Test
    void factorialTestTwo() {
        assertEquals(2, factorial(2));
    }

    @Test
    void factorialTestThree() {
        assertEquals(6, factorial(3));
    }
}