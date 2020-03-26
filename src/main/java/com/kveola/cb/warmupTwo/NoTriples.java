package com.kveola.cb.warmupTwo;

public class NoTriples {
    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length -2; i++) {
            int checkTriple = nums[i];
            if (nums[i+1] == checkTriple && nums[i+2] == checkTriple){
                return false;
            }
        }
        return true;
    }
}
