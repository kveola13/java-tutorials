package com.kveola.cb.strings.one;

public class MinCat {
    public static String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()) + b;
        }
        if (b.length() > a.length()) {
            return a + b.substring(b.length() - a.length());
        }
        return a.concat(b);
    }
}
