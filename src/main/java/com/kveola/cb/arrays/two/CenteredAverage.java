package com.kveola.cb.arrays.two;

import java.util.Arrays;

public class CenteredAverage {
    public static int centeredAverage(int[] nums) {
        int avg = 0;
        nums = Arrays.stream(nums).sorted().toArray();
        for (int i = 1; i < nums.length - 1; i++) {
            avg += nums[i];
        }
        return avg / (nums.length - 2);
    }
}
