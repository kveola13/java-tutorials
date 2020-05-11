package com.kveola.cb.functional.one;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.one.Math1.math1;
import static org.junit.jupiter.api.Assertions.*;

class Math1Test {

    @Test
    void Math1TestOne() {
        List<Integer> init = List.of(1, 2, 3);
        List<Integer> done = List.of(20, 30, 40);
        assertEquals(done, math1(init));
    }

    @Test
    void Math1TestTwo() {
        List<Integer> init = List.of(6, 8, 6, 8, 1);
        List<Integer> done = List.of(70, 90, 70, 90, 20);
        assertEquals(done, math1(init));
    }

    @Test
    void Math1TestThree() {
        List<Integer> init = List.of(10);
        List<Integer> done = List.of(110);
        assertEquals(done, math1(init));
    }
}