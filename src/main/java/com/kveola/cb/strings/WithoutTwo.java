package com.kveola.cb.strings;

public class WithoutTwo {
    public static String without2(String str) {
        if (str.length() < 2) return str;
        return str.substring(0, 2).equals(str.substring(str.length() - 2)) ? str.substring(2) : str;
    }
}
