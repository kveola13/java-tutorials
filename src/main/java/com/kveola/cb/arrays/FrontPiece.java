package com.kveola.cb.arrays;

public class FrontPiece {
    public static int[] frontPiece(int[] nums) {
        if (nums.length < 2) return nums;
        return new int[]{nums[0], nums[1]};
    }
}
