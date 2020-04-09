package com.kveola.cb.logic.one;

public class NearTen {
    public static boolean nearTen(int num) {
        return num % 10 == 2 || num % 10 == 1 || num % 10 == 8 || num % 10 == 9 || num % 10 == 0;
    }
}
