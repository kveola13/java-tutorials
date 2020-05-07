package com.kveola.cb.maps.one;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.kveola.cb.maps.one.MapAB.*;
import static org.junit.jupiter.api.Assertions.*;

class MapABTest {

    @Test
    void mapABTestOne() {
        Map<String, String> initMap = new HashMap<>(Map.of("a", "Hi", "b", "There"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("a", "Hi", "ab", "HiThere", "b", "There"));
        assertEquals(solvedMap, mapAB(initMap));
    }

    @Test
    void mapABTestTwo() {
        Map<String, String> initMap = new HashMap<>(Map.of("a", "Hi"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("a", "Hi"));
        assertEquals(solvedMap, mapAB(initMap));
    }

    @Test
    void mapABTestThree() {
        Map<String, String> initMap = new HashMap<>(Map.of("b", "There"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("b", "There"));
        assertEquals(solvedMap, mapAB(initMap));
    }

    @Test
    void mapAB2TestOne() {
        Map<String, String> initMap = new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("c", "cake"));
        assertEquals(solvedMap, mapAB2(initMap));
    }

    @Test
    void mapAB2TestTwo() {
        Map<String, String> initMap = new HashMap<>(Map.of("a", "aaa", "b", "bbb"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("a", "aaa", "b", "bbb"));
        assertEquals(solvedMap, mapAB2(initMap));
    }

    @Test
    void mapAB2TestThree() {
        Map<String, String> initMap = new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("a", "aaa", "b", "bbb", "c", "aaa"));
        assertEquals(solvedMap, mapAB2(initMap));
    }

    @Test
    void mapAB3TestOne() {
        Map<String, String> initMap = new HashMap<>(Map.of("a", "aaa", "c", "cake"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("a", "aaa", "b", "aaa", "c", "cake"));
        assertEquals(solvedMap, mapAB3(initMap));
    }

    @Test
    void mapAB3TestTwo() {
        Map<String, String> initMap = new HashMap<>(Map.of("b", "bbb", "c", "cake"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("a", "bbb", "b", "bbb", "c", "cake"));
        assertEquals(solvedMap, mapAB3(initMap));
    }

    @Test
    void mapAB3TestThree() {
        Map<String, String> initMap = new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("a", "aaa", "b", "bbb", "c", "cake"));
        assertEquals(solvedMap, mapAB3(initMap));
    }
    @Test
    void mapAB4TestOne() {
        Map<String, String> initMap = new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("a", "aaa", "b", "bb", "c", "aaa"));
        assertEquals(solvedMap, mapAB4(initMap));
    }
    @Test
    void mapAB4TestTwo() {
        Map<String, String> initMap = new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("a", "aa", "b", "bbb", "c", "bbb"));
        assertEquals(solvedMap, mapAB4(initMap));
    }
    @Test
    void mapAB4TestThree() {
        Map<String, String> initMap = new HashMap<>(Map.of("a", "aa", "b", "bbb"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("a", "aa", "b", "bbb", "c", "bbb"));
        assertEquals(solvedMap, mapAB4(initMap));
    }
}
