package com.kveola.cb.maps.two;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }
}
