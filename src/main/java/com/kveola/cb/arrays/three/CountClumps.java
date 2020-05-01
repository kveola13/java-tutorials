package com.kveola.cb.arrays.three;

public class CountClumps {
    public static int countClumps(int[] nums) {
        int clumpCount = 0;
        boolean clump = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (clump) {
                if (nums[i] != nums[i + 1]) {
                    clump = false;
                }
            } else if (nums[i] == nums[i + 1]) {
                clump = true;
                clumpCount++;
            }
        }
        return clumpCount;
    }
}
