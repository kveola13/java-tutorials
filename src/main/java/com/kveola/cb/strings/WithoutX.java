package com.kveola.cb.strings;

public class WithoutX {
    public static String withoutX(String str) {
        String returnText;
        if (str.startsWith("x")) {
            returnText = str.substring(1);
        } else {
            returnText = str;
        }
        if (returnText.endsWith("x")) {
            returnText = returnText.substring(0, returnText.length() - 1);
        }
        return returnText;
    }
}
