package com.kveola.cb.arrays.one;

public class FirstLastSix {
    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length-1] == 6;
    }
}
