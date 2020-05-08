package com.kveola.cb.maps.two;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.kveola.cb.maps.two.WordCount.wordCount;
import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {
    @Test
    void WordCountTestOne() {
        Map<String, Integer> map = Map.of("a", 2, "b", 2, "c", 1);
        assertEquals(map, wordCount(new String[]{"a", "b", "a", "c", "b"}));
    }

    @Test
    void WordCountTestTwo() {
        Map<String, Integer> map = Map.of("a", 1, "b", 1, "c", 1);
        assertEquals(map, wordCount(new String[]{"c", "b", "a"}));
    }

    @Test
    void WordCountTestThree() {
        Map<String, Integer> map = Map.of("c", 4);
        assertEquals(map, wordCount(new String[]{"c", "c", "c", "c"}));
    }
}