package com.kveola.cb.strings.one;

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

    public static String withoutX2(String str) {
        if (str.length() < 2) return str.replaceAll("x", "");
        String subStr = str.substring(0, 2);
        subStr = subStr.replaceAll("x", "");
        return subStr + str.substring(2);
    }
}
