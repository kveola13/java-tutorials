package com.kveola.cb.strings.two;

public class RepeatSeparator {
    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(word);
            if (i != count - 1) stringBuilder.append(sep);
        }
        return stringBuilder.toString();
    }
}
