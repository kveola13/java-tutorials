package com.kveola.cb.strings.two;

public class StarOut {
    public static String starOut(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') continue;
            if (i > 0 && str.charAt(i - 1) == '*') continue;
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
