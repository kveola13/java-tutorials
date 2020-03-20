package com.kveola.cb;

public class NearTen {
    public static int close10(int a, int b) {
        return (Math.abs(10 - a)) == Math.abs(10 - b) ? 0 : 10 - Math.abs(a) > 10 - Math.abs(b) ? a : b;
    }
}
