package com.kveola.cb.functional.two;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.two.NoTeen.noTeen;
import static org.junit.jupiter.api.Assertions.*;

class NoTeenTest {

    @Test
    void NoTeenTestOne() {
        List<Integer> init = List.of(12, 13, 19, 20);
        List<Integer> done = List.of(12, 20);
        assertEquals(done, noTeen(init));
    }

    @Test
    void NoTeenTestTwo() {
        List<Integer> init = List.of(1, 14, 1);
        List<Integer> done = List.of(1, 1);
        assertEquals(done, noTeen(init));
    }

    @Test
    void NoTeenTestThree() {
        List<Integer> init = List.of(15);
        List<Integer> done = List.of();
        assertEquals(done, noTeen(init));
    }
}