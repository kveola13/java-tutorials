package com.kveola.cb.warmupTwo;

public class HasSequence {
    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int startOfSequence = nums[i];
            //System.out.println(Math.abs(nums[i]));
            //System.out.printf("%d,%d,%d\n", nums[i], nums[i+1], nums[i+2]);
            if (nums[i + 1] == startOfSequence + 5 && Math.abs(nums[i + 2] - (startOfSequence -1)) <= 2) {
                return true;
            }
        }
        return false;
    }
}
