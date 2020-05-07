package com.kveola.cb.maps.one;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.kveola.cb.maps.one.Toppings.*;
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

    @Test
    void topping3TestOne() {
        Map<String, String> initMap = new HashMap<>(Map.of("potato", "ketchup"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("potato", "ketchup", "fries", "ketchup"));
        assertEquals(solvedMap, topping3(initMap));
    }

    @Test
    void topping3TestTwo() {
        Map<String, String> initMap = new HashMap<>(Map.of("potato", "butter"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("potato", "butter", "fries", "butter"));
        assertEquals(solvedMap, topping3(initMap));
    }

    @Test
    void topping3TestThree() {
        Map<String, String> initMap = new HashMap<>(Map.of("salad", "oil", "potato", "ketchup"));
        Map<String, String> solvedMap = new HashMap<>
                (Map.of("spinach", "oil", "salad", "oil", "potato", "ketchup", "fries", "ketchup"));
        assertEquals(solvedMap, topping3(initMap));
    }
}