package com.kveola.cb.maps.two;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.kveola.cb.maps.two.Pairs.pairs;
import static org.junit.jupiter.api.Assertions.*;

class PairsTest {
    @Test
    void PairsTestOne() {
        Map<String, String> map = Map.of("b", "g", "c", "e");
        assertEquals(map, pairs(new String[]{"code", "bug"}));
    }

    @Test
    void PairsTestTwo() {
        Map<String, String> map = Map.of("m", "n");
        assertEquals(map, pairs(new String[]{"man", "moon", "main"}));
    }

    @Test
    void PairsTestThree() {
        Map<String, String> map = Map.of("g", "d", "m", "n", "n", "t");
        assertEquals(map, pairs(new String[]{"man", "moon", "good", "night"}));
    }
}