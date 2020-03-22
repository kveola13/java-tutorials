package com.kveola.cb.warmupOne;

public class HasTeen {
    public static boolean hasTeen(int a, int b, int c) {
        return a <= 19 && a >= 13 || b <= 19 && b >= 13 || c <= 19 && c >= 13;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));
    }
}
