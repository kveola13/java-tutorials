package com.kveola.cb.maps;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.kveola.cb.maps.MapAB.mapAB;
import static com.kveola.cb.maps.MapAB.mapAB2;
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
}
