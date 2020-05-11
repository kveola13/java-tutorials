package com.kveola.cb.functional.two;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.two.No9.no9;
import static org.junit.jupiter.api.Assertions.*;

class No9Test {

    @Test
    void No9TestOne() {
        List<Integer> init = List.of(1, 2, 19);
        List<Integer> done = List.of(1, 2);
        assertEquals(done, no9(init));
    }

    @Test
    void No9TestTwo() {
        List<Integer> init = List.of(9, 19, 29, 3);
        List<Integer> done = List.of(3);
        assertEquals(done, no9(init));
    }

    @Test
    void No9TestThree() {
        List<Integer> init = List.of(1, 2, 3);
        List<Integer> done = List.of(1, 2, 3);
        assertEquals(done, no9(init));
    }
}