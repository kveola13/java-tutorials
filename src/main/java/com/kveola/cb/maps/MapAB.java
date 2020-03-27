package com.kveola.cb.maps;

import java.util.Map;

public class MapAB {
    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            } else {
                boolean aIsLongest = Math.max(map.get("a").length(), map.get("b").length()) == map.get("a").length();
                map.put("c", aIsLongest ? map.get("a") : map.get("b"));
            }
        }
        return map;
    }
}
