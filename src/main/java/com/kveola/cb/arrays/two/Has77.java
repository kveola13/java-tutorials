package com.kveola.cb.arrays.two;

public class Has77 {
    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) return true;
            if(i < nums.length-2){
                if (nums[i] == 7 && nums[i + 2] == 7) return true;
            }
        }
        return false;
    }
}
