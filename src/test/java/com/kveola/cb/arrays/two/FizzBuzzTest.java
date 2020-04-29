package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.FizzBuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzzTestOne() {
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, fizzBuzz(1, 6));
    }

    @Test
    void fizzBuzzTestTwo() {
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, fizzBuzz(1, 8));
    }

    @Test
    void fizzBuzzTestThree() {
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}, fizzBuzz(1, 11));
    }
}