package com.kveola.cb.strings;

public class ComboString {
    public static String comboString(String a, String b) {
        return a.length() > b.length() ? b + a + b : a + b + a;
    }
}
