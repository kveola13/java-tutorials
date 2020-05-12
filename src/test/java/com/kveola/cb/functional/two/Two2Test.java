package com.kveola.cb.functional.two;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.two.Two2.two2;
import static org.junit.jupiter.api.Assertions.*;

class Two2Test {

    @Test
    void Two2TestOne() {
        List<Integer> init = List.of(1, 2, 3);
        List<Integer> done = List.of(4, 6);
        assertEquals(done, two2(init));
    }

    @Test
    void Two2TestTwo() {
        List<Integer> init = List.of(2, 6, 11);
        List<Integer> done = List.of(4);
        assertEquals(done, two2(init));
    }

    @Test
    void Two2TestThree() {
        List<Integer> init = List.of(0);
        List<Integer> done = List.of(0);
        assertEquals(done, two2(init));
    }
}