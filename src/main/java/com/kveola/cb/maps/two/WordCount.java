package com.kveola.cb.maps.two;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if(map.containsKey(s)){
                int oldVal = map.get(s);
                map.replace(s, oldVal, oldVal + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }
}
