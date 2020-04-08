package com.kveola.cb.logic.one;

public class SortaSum {
    public static int sortaSum(int a, int b) {
        if (a + b <= 9 || a + b >= 20) return a + b;
        return 20;
    }
}
