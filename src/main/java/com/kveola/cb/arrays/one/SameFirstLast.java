package com.kveola.cb.arrays.one;

public class SameFirstLast {
    public static boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }
}
