package com.kveola.cb.logic.one;

public class InOrder {
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        return bOk ? b < c : a < b && b < c;
    }
}
