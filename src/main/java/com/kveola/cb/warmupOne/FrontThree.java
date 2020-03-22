package com.kveola.cb.warmupOne;

public class FrontThree {
    public static String front3(String str) {
        return str.length() > 3 ? str.substring(0,3).repeat(3) : str.repeat(3);
    }

    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
    }
}
