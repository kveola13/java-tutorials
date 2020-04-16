package com.kveola.cb.strings.two;

public class EndOther {
    public static boolean endOther(String a, String b) {
        return b.toLowerCase().endsWith(a.toLowerCase()) || a.toLowerCase().endsWith(b.toLowerCase());
    }
}
