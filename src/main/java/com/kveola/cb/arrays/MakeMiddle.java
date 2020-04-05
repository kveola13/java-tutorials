package com.kveola.cb.arrays;

public class MakeMiddle {
    public static int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }
}
