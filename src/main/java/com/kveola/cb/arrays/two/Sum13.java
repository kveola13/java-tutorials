package com.kveola.cb.arrays.two;

public class Sum13 {
    public static int sum13(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) i++;
            else count += nums[i];
        }
        return count;
    }
}
