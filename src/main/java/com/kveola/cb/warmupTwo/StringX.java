package com.kveola.cb.warmupTwo;

public class StringX {
    public static String stringX(String str) {
        if (str.length() < 2) return str;
        String replacedString = str.substring(1, str.length() - 1);
        replacedString = replacedString.replace("x", "");
        return str.substring(0, 1) + replacedString + str.substring(str.length() - 1, str.length());
    }
}
