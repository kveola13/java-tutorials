package com.kveola.cb.logic.one;

public class SumLimit {
    public static int sumLimit(int a, int b) {
        String aCopy = "" + a;
        String sumCopy = "" + (a + b);
        if (sumCopy.length() > aCopy.length()) return a;
        return a + b;
    }
}
