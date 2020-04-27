package com.kveola.cb.arrays.two;

import java.util.Arrays;

public class TenRun {
    public static int[] tenRun(int[] nums) {
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                temp = nums[i];
            }
            if (temp != Integer.MIN_VALUE) {
                nums[i] = temp;
            }
        }
        return nums;
    }
}
