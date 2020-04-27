package com.kveola.cb.arrays.two;

public class FizzArray3 {
    public static int[] fizzArray3(int start, int end) {
        int[] array = new int[end - start];
        for (int i = 0; i < end - start; i++) {
            array[i] = i + start;
        }
        return array;
    }
}
