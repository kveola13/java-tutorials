package com.kveola.cb.arrays.two;

public class ShiftLeft {
    public static int[] shiftLeft(int[] nums) {
        if(nums.length <= 1) return nums;
        int [] newArray = new int[nums.length];
        int temp = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(i == 0) temp = nums[i];
            newArray[i] = nums[i+1];
        }
        newArray[nums.length-1] = temp;
        return newArray;
    }
}
