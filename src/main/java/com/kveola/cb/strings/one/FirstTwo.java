package com.kveola.cb.strings.one;

public class FirstTwo {
    public static String firstTwo(String str) {
        return str.length() >= 2 ? str.substring(0, 2) : str;
    }
}
