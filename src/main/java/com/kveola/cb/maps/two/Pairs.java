package com.kveola.cb.maps.two;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static Map<String, String> pairs(String[] strings) {
        Map <String, String> map = new HashMap<>();
        for (String s :strings) {
            map.put(s.substring(0,1), s.substring(s.length()-1));
        }
        return map;
    }
}
