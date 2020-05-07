package com.kveola.cb.maps.two;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.kveola.cb.maps.two.Word0.word0;
import static org.junit.jupiter.api.Assertions.*;

class Word0Test {

    @Test
    void word0TestOne() {
        Map<String, Integer> map = Map.of("a", 0, "b", 0);
        assertEquals(map, word0(new String[]{"a", "b", "a", "b"}));
    }

    @Test
    void word0TestTwo() {
        Map<String, Integer> map = Map.of("a", 0, "b", 0, "c", 0);
        assertEquals(map, word0(new String[]{"a", "b", "a", "c", "b"}));
    }

    @Test
    void word0TestThree() {
        Map<String, Integer> map = Map.of("a", 0, "b", 0, "c", 0);
        assertEquals(map, word0(new String[]{"c", "b", "a"}));
    }
}