package com.kveola.cb.maps.two;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.replace(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }
}
