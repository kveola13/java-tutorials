package com.kveola.cb.maps;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.kveola.cb.maps.MapAB.mapAB;
import static com.kveola.cb.maps.Toppings.topping1;
import static com.kveola.cb.maps.Toppings.topping2;
import static org.junit.jupiter.api.Assertions.*;

class ToppingsTest {

    @Test
    void topping1TestOne() {
        Map<String, String> initMap = new HashMap<>(Map.of("ice cream", "peanuts"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("bread", "butter", "ice cream", "cherry"));
        assertEquals(solvedMap, topping1(initMap));
    }

    @Test
    void topping1TestTwo() {
        Map<String, String> initMap = new HashMap<>();
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("bread", "butter"));
        assertEquals(solvedMap, topping1(initMap));
    }

    @Test
    void topping1TestThree() {
        Map<String, String> initMap = new HashMap<>(Map.of("pancake", "syrup"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("bread", "butter", "pancake", "syrup"));
        assertEquals(solvedMap, topping1(initMap));
    }

    @Test
    void topping2TestOne() {
        Map<String, String> initMap = new HashMap<>(Map.of("ice cream", "cherry"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("yogurt", "cherry", "ice cream", "cherry"));
        assertEquals(solvedMap, topping2(initMap));
    }

    @Test
    void topping2TestTwo() {
        Map<String, String> initMap = new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry"));
        assertEquals(solvedMap, topping2(initMap));
    }

    @Test
    void topping2TestThree() {
        Map<String, String> initMap = new HashMap<>(Map.of("yogurt", "salt"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("yogurt", "salt"));
        assertEquals(solvedMap, topping2(initMap));
    }
}