package com.kveola.cb.arrays;

public class StartOne {
    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length != 0) if (a[0] == 1) count++;
        if (b.length != 0) if (b[0] == 1) count++;
        return count;
    }
}
