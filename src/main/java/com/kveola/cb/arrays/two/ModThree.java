package com.kveola.cb.arrays.two;

public class ModThree {
    public static boolean modThree(int[] nums) {
        boolean containsThreeOdd = false;
        boolean containsThreeEven = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) containsThreeEven = true;
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) containsThreeOdd = true;
        }
        return containsThreeEven || containsThreeOdd;
    }
}
