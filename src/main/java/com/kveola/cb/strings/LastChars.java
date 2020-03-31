package com.kveola.cb.strings;

public class LastChars {
    public static String lastChars(String a, String b) {
        return a.isEmpty() && b.isEmpty() ? "@@" : a.isEmpty() ? "@" + b.substring(b.length() - 1) : b.isEmpty() ? a.charAt(0) + "@" : a.charAt(0) + b.substring(b.length() - 1);
    }
}
