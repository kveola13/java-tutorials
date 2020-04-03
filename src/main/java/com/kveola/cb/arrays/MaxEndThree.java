package com.kveola.cb.arrays;

import java.util.Arrays;

public class MaxEndThree {
    public static int[] maxEnd3(int[] nums) {
        int max = nums[0];
        if (max < nums[nums.length - 1]){
            max = nums[nums.length-1];
        }
        Arrays.fill(nums, max);
        return nums;
    }
}
