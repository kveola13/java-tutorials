package com.kveola.cb.maps.two;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s.substring(0, 1))) {
                String old = map.get(s.substring(0,1));
                map.replace(s.substring(0,1), old + s);
            } else {
                map.put(s.substring(0, 1), s);
            }
        }
        return map;
    }
}
