package com.kveola.cb.maps;

import java.util.Map;

public class MapAB {
    public static Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;
    }
    public static Map<String, String> mapAB2(Map<String, String> map) {
        if(map.containsKey("a")&& map.containsKey("b")){
            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}
