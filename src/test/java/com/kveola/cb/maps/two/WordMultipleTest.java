package com.kveola.cb.maps.two;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.kveola.cb.maps.two.WordMultiple.wordMultiple;
import static org.junit.jupiter.api.Assertions.*;

class WordMultipleTest {

    @Test
    void WordMultipleTestOne() {
        Map<String, Boolean> map = Map.of("a", true, "b", true, "c", false);
        assertEquals(map, wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
    }

    @Test
    void WordMultipleTestTwo() {
        Map<String, Boolean> map = Map.of("a", false, "b", false, "c", false);
        assertEquals(map, wordMultiple(new String[]{"c", "b", "a"}));
    }

    @Test
    void WordMultipleTestThree() {
        Map<String, Boolean> map = Map.of("c", true);
        assertEquals(map, wordMultiple(new String[]{"c", "c", "c", "c"}));
    }

    @Test
    void WordMultipleTestFour() {
        Map<String, Boolean> map = Map.of("a", true, "b", true, "d", true, "e", false, "x", false, "z", true);
        assertEquals(map, wordMultiple(new String[]{"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x"}));
    }
}