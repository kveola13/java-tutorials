package com.kveola.cb.arrays;

public class MakeTwo {
    public static int[] make2(int[] a, int[] b) {
        int[] arrayToReturn = new int[a.length + b.length];
        System.arraycopy(a, 0, arrayToReturn, 0, a.length);
        System.arraycopy(b, 0, arrayToReturn, a.length, b.length);
        return new int[]{arrayToReturn[0], arrayToReturn[1]};
    }

    public static int[] make2Alt(int[] a, int[] b) {
        int[] arrayToReturn = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            arrayToReturn[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            arrayToReturn[a.length + j] = b[j];
        }
        return new int[]{arrayToReturn[0], arrayToReturn[1]};
    }
}
