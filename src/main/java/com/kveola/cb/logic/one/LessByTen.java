package com.kveola.cb.logic.one;

public class LessByTen {
    public static boolean lessBy10(int a, int b, int c) {
        return a <= b - 10 || b <= c - 10 || c <= a - 10 || a <= c - 10 || b <= a - 10 || c <= b - 10;
    }
}
