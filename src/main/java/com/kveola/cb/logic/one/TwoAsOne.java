package com.kveola.cb.logic.one;

public class TwoAsOne {
    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || b + c == a || c + a == b;
    }
}
