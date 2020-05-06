package com.kveola.cb.ap.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.ap.one.MergeTwo.mergeTwo;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoTest {

    @Test
    void mergeTwoTestOne() {
        assertArrayEquals(new String[]{"a", "b", "c"}, mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3));
    }

    @Test
    void mergeTwoTestTwo() {
        assertArrayEquals(new String[]{"a", "c", "f"}, mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3));
    }

    @Test
    void mergeTwoTestThree() {
        assertArrayEquals(new String[]{"c", "f", "g"}, mergeTwo(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3));
    }
}