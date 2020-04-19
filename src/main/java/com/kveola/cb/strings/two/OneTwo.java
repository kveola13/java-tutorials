package com.kveola.cb.strings.two;

public class OneTwo {
    public static String oneTwo(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            stringBuilder.append(str, i + 1, i + 3).append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
