package com.kveola.cb.strings;

public class MiddleThree {
    public static String middleThree(String str) {
        return str.length() > 3 ? str.substring(str.length() / 2 - 1, str.length() / 2 + 2) : str;
    }
}
