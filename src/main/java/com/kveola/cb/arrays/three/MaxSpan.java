package com.kveola.cb.arrays.three;

public class MaxSpan {
    public static int maxSpan(int[] nums) {
        int largestSpanCount = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] == nums[i]) {
                    temp = j - i;
                    break;
                }
            }
            if (temp > largestSpanCount) largestSpanCount = temp;
        }
        return nums.length > 0 ? largestSpanCount + 1 : 0;
    }
}
