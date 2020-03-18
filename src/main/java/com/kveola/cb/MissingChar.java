package com.kveola.cb;

public class MissingChar {
    public static String missingChar(String str, int n) {
        return str.replace(String.valueOf(str.charAt(n)), "");
    }

    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
    }
}
