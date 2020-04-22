package com.kveola.cb.arrays.one;

public class MakeMiddle {
    public static int[] makeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }
}
