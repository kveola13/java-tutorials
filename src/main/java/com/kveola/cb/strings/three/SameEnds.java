package com.kveola.cb.strings.three;

public class SameEnds {
    public static String sameEnds(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length() / 2 + 1; i++) {
            if (string.substring(0, i).equals(string.substring(string.length() - i)))
                stringBuilder.append(string, 0, i);
        }
        return stringBuilder.toString();
    }
}
