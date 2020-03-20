package com.kveola.cb;

public class IntMax {
    public static int intMax(int a, int b, int c) {
        return Math.max(a, b) == a ? Math.max(a, c) == a ? a : c : Math.max(b, c) == b ? b : c;
    }
}
