package com.kveola.cb.strings;

public class ExtraEnd {
    public static String extraEnd(String str) {
        return str.length() >= 2 ? str.substring(str.length() - 2).repeat(3) : "incorrect string length";
    }
    public static String extraEndAlt(String str) {
        String strReturn = str.substring(str.length() -2);
        return str.length() >= 2 ? strReturn + strReturn + strReturn : "incorrect string length";
    }
}
