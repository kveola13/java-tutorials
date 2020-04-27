package com.kveola.cb.arrays.two;

public class TripleUp {
    public static boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i + 1] + 1) return true;
        }
        return false;
    }
}
