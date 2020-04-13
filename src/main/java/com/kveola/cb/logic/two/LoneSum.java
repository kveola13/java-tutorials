package com.kveola.cb.logic.two;

public class LoneSum {
    public static int loneSum(int a, int b, int c) {
        if (a == b && a == c) return 0;
        if (a == b) return c;
        if (a == c) return b;
        if (b == c) return a;
        return a + b + c;
    }
}
