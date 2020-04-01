package com.kveola.cb.strings;

public class ExtraFront {
    public static String extraFront(String str) {
        return str.length() > 2 ? str.substring(0, 2).repeat(3) : str.repeat(3);
    }

    public static String extraFrontAlt(String str) {
        if (str.length() < 2) return  str + str + str;
        String repeat = str.substring(0, 2);
        return repeat + repeat +repeat;
    }
}
