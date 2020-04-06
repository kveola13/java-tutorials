package com.kveola.cb.arrays;

public class MaxTriple {
    public static int maxTriple(int[] nums) {
        if (nums.length < 2) return nums[0];
        if (nums.length < 3) return Math.max(nums[0], nums[1]);
        return Math.max(Math.max(nums[0], nums[nums.length / 2]), nums[nums.length - 1]);
    }
}
