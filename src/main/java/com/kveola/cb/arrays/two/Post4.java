package com.kveola.cb.arrays.two;

public class Post4 {
    public static int[] post4(int[] nums) {
        int count = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == 4) break;
            count++;
        }
        int[] returnArray = new int[count];
        for (int i = 0; i < count; i++) {
            returnArray[i] = nums[nums.length-count+i];
        }
        return returnArray;
    }

    public static int[] post4Alt(int[] nums) {
        int count = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == 4) break;
            count++;
        }
        int[] returnArray = new int[count];
        if (count >= 0) System.arraycopy(nums, nums.length - count, returnArray, 0, count);
        return returnArray;
    }
}
