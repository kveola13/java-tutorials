package com.kveola.cb.arrays.two;

public class FizzArray2 {
    public static String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }
}
