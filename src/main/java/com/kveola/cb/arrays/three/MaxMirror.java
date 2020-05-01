package com.kveola.cb.arrays.three;

public class MaxMirror {
    public static int maxMirror(int[] nums) {
        int mirrorCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = nums.length - 1; j >= 0 && i + temp < nums.length; j--) {
                if (nums[i + temp] == nums[j]) {
                    temp++;
                } else {
                    if (temp > 0) {
                        mirrorCount = Math.max(temp, mirrorCount);
                        temp = 0;
                    }
                }
            }
            mirrorCount = Math.max(temp, mirrorCount);
        }
        return mirrorCount;
    }
}
