package com.kveola.cb.functional.one;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.one.RightDigit.rightDigit;
import static org.junit.jupiter.api.Assertions.*;

class RightDigitTest {

    @Test
    void RightDigitTestOne() {
        List<Integer> init = List.of(1, 22, 93);
        List<Integer> done = List.of(1, 2, 3);
        assertEquals(done, rightDigit(init));
    }

    @Test
    void RightDigitTestTwo() {
        List<Integer> init = List.of(16, 8, 886, 8, 1);
        List<Integer> done = List.of(6, 8, 6, 8, 1);
        assertEquals(done, rightDigit(init));
    }

    @Test
    void RightDigitTestThree() {
        List<Integer> init = List.of(10, 0);
        List<Integer> done = List.of(0, 0);
        assertEquals(done, rightDigit(init));
    }
}