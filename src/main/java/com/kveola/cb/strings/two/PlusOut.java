package com.kveola.cb.strings.two;

public class PlusOut {
    public static String plusOut(String str, String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith(word, i)) {
                stringBuilder.append(str, i, i + word.length());
                i += word.length() - 1;
            } else {
                stringBuilder.append("+");
            }
        }
        return stringBuilder.toString();
    }
}
