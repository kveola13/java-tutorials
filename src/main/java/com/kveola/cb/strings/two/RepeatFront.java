package com.kveola.cb.strings.two;

public class RepeatFront {
    public static String repeatFront(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i > 0; i--) {
            stringBuilder.append(str, 0, i);
        }
        return stringBuilder.toString();
    }
}
