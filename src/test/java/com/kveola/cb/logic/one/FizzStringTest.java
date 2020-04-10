package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.FizzString.fizzString;
import static org.junit.jupiter.api.Assertions.*;

class FizzStringTest {

    @Test
    void fizzStringTestOne() {
        assertEquals("Fizz", fizzString("fig"));
    }

    @Test
    void fizzStringTestTwo() {
        assertEquals("Buzz", fizzString("dib"));
    }

    @Test
    void fizzStringTestThree() {
        assertEquals("FizzBuzz", fizzString("fib"));
    }
}