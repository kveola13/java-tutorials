package com.kveola.cb.maps.two;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.kveola.cb.maps.two.FirstChar.firstChar;
import static org.junit.jupiter.api.Assertions.*;

class FirstCharTest {

    @Test
    void FirstCharTestOne() {
        Map<String, String> map = Map.of("s", "saltsoda", "t", "teatoast");
        assertEquals(map, firstChar(new String[]{"salt", "tea", "soda", "toast"}));
    }

    @Test
    void FirstCharTestTwo() {
        Map<String, String> map = Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d");
        assertEquals(map, firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
    }

    @Test
    void FirstCharTestThree() {
        Map<String, String> map = Map.of();
        assertEquals(map, firstChar(new String[]{}));
    }
}