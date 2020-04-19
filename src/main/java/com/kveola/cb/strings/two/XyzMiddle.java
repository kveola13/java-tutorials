package com.kveola.cb.strings.two;

public class XyzMiddle {
    public static boolean xyzMiddle(String str) {
        int charPos = str.indexOf("xyz");
        String prefix = str.substring(0, charPos);
        String suffix = str.substring(prefix.length() + 3);
        return Math.abs(prefix.length() - suffix.length()) <= 1;
    }
}
