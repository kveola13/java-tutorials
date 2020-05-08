package com.kveola.cb.maps.two;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public static String wordAppend(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                int count = map.get(s);
                map.replace(s, count, count + 1);
            } else {
                map.put(s, 1);
            }
            if(map.get(s) % 2 == 0){
                stringBuilder.append(s);
            }
        }
        return stringBuilder.toString();
    }
}
