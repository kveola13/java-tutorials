package com.kveola.cb.warmupTwo;

public class StringBits {
    public static String stringBits(String str) {
        StringBuilder bits = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + 2) {
            bits.append(str.charAt(i));
        }
        return bits.toString();
    }
}
