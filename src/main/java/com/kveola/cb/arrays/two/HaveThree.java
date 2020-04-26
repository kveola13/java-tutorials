package com.kveola.cb.arrays.two;

public class HaveThree {
    public static boolean haveThree(int[] nums) {
        int threeCount = 0;
        if (nums.length < 5) return false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                i++;
                threeCount++;
            }
        }
        return threeCount == 3;
    }
}
