package com.kveola.cb.warmupTwo;

public class AltPairs {
    public static String altPairs(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            int endOfString = i + 2;
            if (endOfString > str.length()) {
                endOfString = str.length();
            }
            stringBuilder.append(str, i, endOfString);
        }
        return stringBuilder.toString();
    }
}
