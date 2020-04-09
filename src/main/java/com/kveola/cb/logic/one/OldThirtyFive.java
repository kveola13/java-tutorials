package com.kveola.cb.logic.one;

public class OldThirtyFive {
    public static boolean old35(int n) {
        return n % 3 == 0 && n % 5 != 0 || n % 3 != 0 && n % 5 == 0;
    }
}
