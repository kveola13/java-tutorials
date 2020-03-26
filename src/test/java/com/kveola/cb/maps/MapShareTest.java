package com.kveola.cb.maps;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.kveola.cb.maps.MapBully.mapBully;
import static com.kveola.cb.maps.MapShare.mapShare;
import static org.junit.jupiter.api.Assertions.*;

class MapShareTest {

    @Test
    void mapShareTestOne() {
        Map<String, String> mapInit = new HashMap<>();
        Map<String, String> mapSolved = new HashMap<>();
        mapInit.put("a", "aaa");
        mapInit.put("b", "bbb");
        mapInit.put("c", "ccc");
        mapSolved.put("a", "aaa");
        mapSolved.put("b", "aaa");
        assertEquals(mapSolved, mapShare(mapInit));
    }
    @Test
    void mapShareTestTwo() {
        Map<String, String> mapInit = new HashMap<>();
        Map<String, String> mapSolved = new HashMap<>();
        mapInit.put("b", "xyz");
        mapInit.put("c", "ccc");
        mapSolved.put("b", "xyz");
        assertEquals(mapSolved, mapShare(mapInit));
    }
    @Test
    void mapShareTestThree() {
        Map<String, String> mapInit = new HashMap<>();
        Map<String, String> mapSolved = new HashMap<>();
        mapInit.put("a", "aaa");
        mapInit.put("c", "meh");
        mapInit.put("d", "hi");
        mapSolved.put("a", "aaa");
        mapSolved.put("b", "aaa");
        mapSolved.put("d", "hi");
        assertEquals(mapSolved, mapShare(mapInit));
    }
}