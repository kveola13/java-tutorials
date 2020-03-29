package com.kveola.cb.strings;

public class RightTwo {
    public static String right2(String str) {
        return str.length() >= 2 ? str.substring(str.length() - 2) + str.substring(0, str.length() - 2) : "incorrect length";
    }
}
