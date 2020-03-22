package com.kveola.cb.warmupOne;

public class NotString {
    public static String notString(String str) {
        return str.length() < 3 ? "not " + str : str.substring(0, 3).equals("not") ? str :  "not " + str;
    }

    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println("not bad");
    }
}
