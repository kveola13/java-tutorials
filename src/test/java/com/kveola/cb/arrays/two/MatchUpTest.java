package com.kveola.cb.arrays.two;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.arrays.two.MatchUp.matchUp;
import static org.junit.jupiter.api.Assertions.*;

class MatchUpTest {

    @Test
    void matchUpTestOne() {
        assertEquals(2, matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
    }
    @Test
    void matchUpTestTwo() {
        assertEquals(3, matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
    }
    @Test
    void matchUpTestThree() {
        assertEquals(2, matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
    }
}