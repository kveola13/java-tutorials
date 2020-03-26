package com.kveola.cb.maps;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.kveola.cb.maps.MapBully.mapBully;
import static org.junit.jupiter.api.Assertions.*;

class MapBullyTest {

    @Test
    void mapBullyTestOne() {
        Map<String, String> mapInit = new HashMap<>();
        Map<String, String> mapSolved = new HashMap<>();
        mapInit.put("a", "candy");
        mapInit.put("b", "dirt");
        mapSolved.put("a", "");
        mapSolved.put("b", "candy");
        assertEquals(mapSolved, mapBully(mapInit));
    }

    @Test
    void mapBullyTestTwo() {
        Map<String, String> mapInit = new HashMap<>();
        Map<String, String> mapSolved = new HashMap<>();
        mapInit.put("a", "candy");
        mapSolved.put("a", "");
        mapSolved.put("b", "candy");
        assertEquals(mapSolved, mapBully(mapInit));
    }

    @Test
    void mapBullyTestThree() {
        Map<String, String> mapInit = new HashMap<>();
        Map<String, String> mapSolved = new HashMap<>();
        mapInit.put("a", "candy");
        mapInit.put("b", "carrot");
        mapInit.put("c", "meh");
        mapSolved.put("a", "");
        mapSolved.put("b", "candy");
        mapSolved.put("c", "meh");
        assertEquals(mapSolved, mapBully(mapInit));
    }
}