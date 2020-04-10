package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.FizzString.fizzString;
import static com.kveola.cb.logic.one.FizzString.fizzString2;
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

    @Test
    void fizzString2TestOne() {
        assertEquals("1!", fizzString2(1));
    }

    @Test
    void fizzString2TestTwo() {
        assertEquals("2!", fizzString2(2));
    }

    @Test
    void fizzString2TestThree() {
        assertEquals("Fizz!", fizzString2(3));
    }
}