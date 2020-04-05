package com.kveola.cb.arrays;

public class FixTwoThree {
    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i+1] == 3){
                nums[i+1] = 0;
            }
        }
        return nums;
    }
}
