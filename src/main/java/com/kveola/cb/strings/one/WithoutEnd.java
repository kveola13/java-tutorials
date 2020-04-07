package com.kveola.cb.strings.one;

public class WithoutEnd {
    public static String withoutEnd(String str) {
        return str.length() >= 2 ? str.substring(1, str.length() - 1) : "incorrect length";
    }

    public static String withouEnd2(String str) {
        return str.length() > 2 ? str.substring(1, str.length() - 1) : "";
    }
}
