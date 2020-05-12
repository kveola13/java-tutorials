package com.kveola.cb.functional.two;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.two.Square56.square56;
import static org.junit.jupiter.api.Assertions.*;

class Square56Test {

    @Test
    void Square56TestOne() {
        List<Integer> init = List.of(3,1,4);
        List<Integer> done = List.of(19,11);
        assertEquals(done, square56(init));
    }

    @Test
    void Square56TestTwo() {
        List<Integer> init = List.of(1);
        List<Integer> done = List.of(11);
        assertEquals(done, square56(init));
    }

    @Test
    void Square56TestThree() {
        List<Integer> init = List.of(2);
        List<Integer> done = List.of(14);
        assertEquals(done, square56(init));
    }
}