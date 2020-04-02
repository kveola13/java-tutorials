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

    public static String withoutX2(String str) {
        if (str.length() < 2) return "";
        String subStr = str.substring(0, 2);
        if (subStr.startsWith("x")) {
            subStr = subStr.substring(1);
            if(subStr.startsWith("x")){
                subStr = subStr.substring(1);
            }
        }
        if (subStr.endsWith("x")) {
            subStr = subStr.substring(0, 1);
        }
        return subStr + str.substring(2);
    }
}
