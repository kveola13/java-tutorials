package com.kveola.cb.strings.two;

public class PrefixAgain {
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = prefix.length(); i < str.length(); i++) {
            if (str.startsWith(prefix, i)) return true;
        }
        return false;
    }
}
