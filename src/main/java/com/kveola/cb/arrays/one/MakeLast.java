package com.kveola.cb.arrays.one;

import java.util.Arrays;

public class MakeLast {
    public static int[] makeLast(int[] nums) {
        int[] newNums = new int[nums.length * 2];
        Arrays.fill(newNums, 0);
        newNums[newNums.length-1] = nums[nums.length-1];
        return newNums;
    }
}
