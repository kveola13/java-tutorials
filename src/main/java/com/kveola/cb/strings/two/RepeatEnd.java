package com.kveola.cb.strings.two;

public class RepeatEnd {
    public static String repeatEnd(String str, int n) {
        return str.substring(str.length() - n).repeat(n);
    }
}
