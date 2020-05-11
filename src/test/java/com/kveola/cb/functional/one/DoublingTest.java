package com.kveola.cb.functional.one;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.kveola.cb.functional.one.Doubling.doubling;
import static org.junit.jupiter.api.Assertions.*;

class DoublingTest {

    @Test
    void DoublingTestOne() {
        List<Integer> init = List.of(1, 2, 3);
        List<Integer> doubled = List.of(2, 4, 6);
        assertEquals(doubled, doubling(init));
    }

    @Test
    void DoublingTestTwo() {
        List<Integer> init = List.of(6, 8, 6, 8, -1);
        List<Integer> doubled = List.of(12, 16, 12, 16, -2);
        assertEquals(doubled, doubling(init));
    }

    @Test
    void DoublingTestThree() {
        List<Integer> init = List.of();
        List<Integer> doubled = List.of();
        assertEquals(doubled, doubling(init));
    }
}