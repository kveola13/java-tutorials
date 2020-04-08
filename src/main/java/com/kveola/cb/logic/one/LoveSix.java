package com.kveola.cb.logic.one;

public class LoveSix {
    public static boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(Math.abs(a - b)) == 6;
    }
}
