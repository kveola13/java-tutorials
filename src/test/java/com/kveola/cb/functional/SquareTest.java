package com.kveola.cb.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.Square.square;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void SquareTestOne() {
        List<Integer> init = List.of(1, 2, 3);
        List<Integer> squared = List.of(1, 4, 9);
        assertEquals(squared, square(init));
    }

    @Test
    void SquareTestTwo() {
        List<Integer> init = List.of(6, 8, -6, -8, 1);
        List<Integer> squared = List.of(36, 64, 36, 64, 1);
        assertEquals(squared, square(init));
    }

    @Test
    void SquareTestThree() {
        List<Integer> init = List.of();
        List<Integer> squared = List.of();
        assertEquals(squared, square(init));
    }
}