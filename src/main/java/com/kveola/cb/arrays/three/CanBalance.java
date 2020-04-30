package com.kveola.cb.arrays.three;


public class CanBalance {
    public static boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += nums[j];
            }
            for (int k = i; k < nums.length; k++) {
                sum -= nums[k];
            }
            if(sum == 0) return true;
        }
        return false;
    }
}
