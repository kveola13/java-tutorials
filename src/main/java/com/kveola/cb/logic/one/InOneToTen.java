package com.kveola.cb.logic.one;

public class InOneToTen {
    public static boolean in1To10(int n, boolean outsideMode) {
        return outsideMode ? n <= 1 || n >= 10 : n >= 1 && n <= 10;
    }
}
