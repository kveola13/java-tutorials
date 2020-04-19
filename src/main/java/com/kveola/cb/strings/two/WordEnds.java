package com.kveola.cb.strings.two;

public class WordEnds {
    public static String wordEnds(String str, String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith(word, i) && i >= 1) {
                stringBuilder.append(str.charAt(i - 1));
            }
            if (str.startsWith(word, i) && i + word.length() < str.length()) {
                stringBuilder.append(str.charAt(i + word.length()));
            }
        }
        return stringBuilder.toString();
    }
}
