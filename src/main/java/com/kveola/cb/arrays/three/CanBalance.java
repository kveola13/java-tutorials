package com.kveola.cb.arrays.three;

import java.util.Arrays;

public class CanBalance {
    public static boolean canBalance(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int[] leftArray = new int[nums.length];
            System.arraycopy(nums, 0, leftArray, 0, i);
            int[] rightArray = new int[nums.length];
            System.arraycopy(nums, nums.length - i, rightArray, 0, i);
            if (Arrays.stream(leftArray).sum() == Arrays.stream(rightArray).sum()) return true;
        }
        return false;
    }
}
