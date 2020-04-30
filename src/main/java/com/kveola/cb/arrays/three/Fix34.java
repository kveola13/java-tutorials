package com.kveola.cb.arrays.three;

import java.util.Arrays;

public class Fix34 {
    public static int[] fix34(int[] nums) {
        int[] returnArray = new int[nums.length];
        int[] tempArray = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                returnArray[i] = nums[i];
                for (int num : nums) {
                    if (num == 4) {
                        returnArray[i + 1] = num;
                    }
                }
            }
            if (nums[i] != 3 && nums[i] != 4) tempArray[i] = nums[i];
        }
        tempArray = Arrays.stream(tempArray).filter(num -> num != 0).toArray();
        for (int i = 0; i < returnArray.length; i++) {
            if (returnArray[i] == 0) {
                returnArray[i] = tempArray[count];
                count++;
            }
        }
        return returnArray;
    }
}
