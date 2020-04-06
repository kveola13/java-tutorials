package com.kveola.cb.arrays;

public class MidThree {
    public static int[] midThree(int[] nums) {
        int half = nums.length / 2;
        return new int[]{nums[half - 1], nums[half], nums[half + 1]};
    }
}
