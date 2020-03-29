package com.kveola.cb.strings;

public class LeftTwo {
    public static String left2(String str) {
        return str.length() >= 2 ? str.substring(2) + str.substring(0, 2) : "incorrect length";
    }
}
