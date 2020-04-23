package com.kveola.cb.arrays.two;

public class BigDiff {
    public static int bigDiff(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i < smallest) {
                smallest = i;
            }
            if (i > biggest) {
                biggest = i;
            }
        }
        return Math.abs(biggest - smallest);
    }
}
