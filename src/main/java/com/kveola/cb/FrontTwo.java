package com.kveola.cb;

public class FrontTwo {
    public static String front22(String str) {
        return str.length() < 2 ? str.repeat(3) : str.substring(0,2) + str + str.substring(0,2);
    }

    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
    }
}
