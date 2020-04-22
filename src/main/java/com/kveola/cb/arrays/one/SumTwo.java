package com.kveola.cb.arrays.one;

import java.util.Arrays;

public class SumTwo {
    public static int sum2(int[] nums) {
        return nums.length < 2 ? Arrays.stream(nums).sum() : nums[0] + nums[1];
    }
}
