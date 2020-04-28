package com.kveola.cb.arrays.two;


public class NotAlone {
    public static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && (nums[i - 1] != nums[i] && nums[i + 1] != nums[i])) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }
}
