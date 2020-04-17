package com.kveola.cb.strings.two;

public class MixString {
    public static String mixString(String a, String b) {
        StringBuilder stringToReturn = new StringBuilder();
        int length = Math.max(a.length(), b.length());
        for (int i = 0; i < length; i++) {
            if(i < a.length()) stringToReturn.append(a.charAt(i));
            if(i < b.length()) stringToReturn.append(b.charAt(i));
        }
        return stringToReturn.toString();
    }
}
