package com.kveola.cb.maps.two;

import java.util.HashMap;
import java.util.Map;

public class Word0 {
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> returnMap = new HashMap<>();
        for (String s : strings) {
            System.out.printf("Trying to add %s, is it already here? %s\n", s, returnMap.containsKey(s));
            returnMap.put(s, 0);
        }
        return returnMap;
    }
}
