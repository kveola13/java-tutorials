package com.kveola.cb.warmupTwo;

public class StringExplode {
    public static String stringSplosion(String str) {
        StringBuilder explode = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            explode.append(str, 0, i + 1);
        }
        return explode.toString();
    }
}
