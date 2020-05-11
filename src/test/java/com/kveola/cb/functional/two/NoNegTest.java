package com.kveola.cb.functional.two;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.two.NoNeg.noNeg;
import static org.junit.jupiter.api.Assertions.*;

class NoNegTest {

    @Test
    void NoNegTestOne() {
        List<Integer> init = List.of(1, -2);
        List<Integer> done = List.of(1);
        assertEquals(done, noNeg(init));
    }

    @Test
    void NoNegTestTwo() {
        List<Integer> init = List.of(-3, -3, 3, 3);
        List<Integer> done = List.of(3, 3);
        assertEquals(done, noNeg(init));
    }

    @Test
    void NoNegTestThree() {
        List<Integer> init = List.of(-1, -1, -1);
        List<Integer> done = List.of();
        assertEquals(done, noNeg(init));
    }
}