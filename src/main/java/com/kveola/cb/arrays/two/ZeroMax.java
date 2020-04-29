package com.kveola.cb.arrays.two;

public class ZeroMax {
    public static int[] zeroMax(int[] nums) {
        int[] returnArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = 0;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 == 1 && nums[j] > temp) {
                        temp = nums[j];
                    }
                }
                returnArray[i] = temp;
            } else{
                returnArray[i] = nums[i];
            }
        }
        return returnArray;
    }
}
