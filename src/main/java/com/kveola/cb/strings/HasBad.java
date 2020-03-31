package com.kveola.cb.strings;

public class HasBad {
    public static boolean hasBad(String str) {
        if(str.length() <= 2) return false;
        if (str.length() == 3) return str.equals("bad");
        return str.substring(0,4).contains("bad");
    }
}
