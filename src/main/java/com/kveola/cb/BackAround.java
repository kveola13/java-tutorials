package com.kveola.cb;

public class BackAround {
    public static String backAround(String str) {
        return str.length() > 0 ?
                str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1) : null;
    }

    public static void main(String[] args) {
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }
}
