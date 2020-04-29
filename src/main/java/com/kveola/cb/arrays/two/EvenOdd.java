package com.kveola.cb.arrays.two;

public class EvenOdd {
    public static int[] evenOdd(int[] nums) {
        int[] returnArray = new int[nums.length];
        int count = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                returnArray[count] = i;
                count++;
            }
        }
        for (int j : nums) {
            if (j % 2 == 1) {
                returnArray[count] = j;
                count++;
            }
        }
        return returnArray;
    }
}
