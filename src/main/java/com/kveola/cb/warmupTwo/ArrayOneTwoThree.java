package com.kveola.cb.warmupTwo;

public class ArrayOneTwoThree {
    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            /*System.out.println(nums[i]);
            System.out.println(nums[i+1]);
            System.out.println(nums[i+2]);
            */
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
    }
}
