package com.kveola.cb.logic.one;

public class TeenSum {
    public static int teenSum(int a, int b) {
        boolean aIsNotTeen = a <= 12 || a >= 20;
        boolean bIsNotTeen = b <= 12 || b >= 20;
        return aIsNotTeen && bIsNotTeen ? a + b : 19;
    }
}
