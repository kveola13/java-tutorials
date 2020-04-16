package com.kveola.cb.strings.two;

public class XyzThere {
    public static boolean xyzThere(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("xyz")) return true;
            if (!str.startsWith(".", i) && str.startsWith("xyz", i + 1)) {
                return true;
            }
        }
        return false;
    }
}
