package com.kveola.cb.arrays.two;

public class WithoutTen {
    public static int[] withoutTen(int[] nums) {
        int[] returnArray = new int[nums.length];
        int count = 0;
        for (int i : nums) {
            if (i != 10) {
                returnArray[count] = i;
                count++;
            }
        }
        return returnArray;
    }
}
