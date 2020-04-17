package com.kveola.cb.strings.two;

public class RepeatEnd {
    public static String repeatEnd(String str, int n) {
        return str.substring(str.length() - n).repeat(n);
    }

    public static String repeatEndAlt(String str, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(str.substring(str.length()-n));
        }
        return stringBuilder.toString();
    }
}
