package com.kveola.cb;

public class absDiff {
    public static int diff21(int n) {
        return Math.abs(n > 21 ? (n - 21) * 2 : n - 21);
    }

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
    }
}
