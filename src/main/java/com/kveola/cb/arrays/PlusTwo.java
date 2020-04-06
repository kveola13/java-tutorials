package com.kveola.cb.arrays;

import java.util.Arrays;

public class PlusTwo {
    public static int[] plusTwo(int[] a, int[] b) {
        int[] array = new int[a.length + b.length];
        System.arraycopy(a, 0, array, 0, a.length);
        System.arraycopy(b, 0, array, a.length, b.length);
        return array;
    }

    public static int[] plusTwoAlt(int[] a, int[] b) {
        int[] array = new int[a.length + b.length];
        int counter;
        for (counter = 0; counter < a.length; counter++) {
            array[counter] = a[counter];
        }
        for (int j = 0; j < b.length; j++) {
            array[counter + j] = b[j];
        }
        return array;
    }
}
