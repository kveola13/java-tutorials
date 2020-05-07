package com.kveola.cb.maps.two;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.kveola.cb.maps.two.WordLen.wordLen;
import static org.junit.jupiter.api.Assertions.*;

class WordLenTest {

    @Test
    void wordLenTestOne() {
        Map<String, Integer> map = Map.of("bb", 2, "a", 1);
        assertEquals(map, wordLen(new String[]{"a", "bb", "a", "bb"}));
    }

    @Test
    void wordLenTestTwo() {
        Map<String, Integer> map = Map.of("that", 4, "and", 3, "this", 4);
        assertEquals(map, wordLen(new String[]{"this", "and", "that", "and"}));
    }

    @Test
    void wordLenTestThree() {
        Map<String, Integer> map = Map.of("code", 4, "bug", 3);
        assertEquals(map, wordLen(new String[]{"code", "code", "code", "bug"}));
    }
}