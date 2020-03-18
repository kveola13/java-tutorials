package com.kveola.cb;

public class FrontBack {
    public static String frontBack(String str) {
        return str.length() > 1 ?
                str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0) : str;
    }

    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("ab"));
        System.out.println(frontBack("a"));
    }
}
