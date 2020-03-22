package com.kveola.cb.warmupTwo;

public class FrontTimes {
    public static String frontTimes(String str, int n) {
        return str.length() >= 3 ? str.substring(0, 3).repeat(n) : str;
    }
}
