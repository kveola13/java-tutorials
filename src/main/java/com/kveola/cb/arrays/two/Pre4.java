package com.kveola.cb.arrays.two;

public class Pre4 {
    public static int[] pre4(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 4) break;
            count++;
        }
        int[] returnArray = new int[count];
        for (int i = 0; i < count; i++) {
            returnArray[i] = nums[i];
        }
        return returnArray;
    }
    public static int[] pre4Alt(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 4) break;
            count++;
        }
        int[] returnArray = new int[count];
        if (count >= 0) System.arraycopy(nums, 0, returnArray, 0, count);
        return returnArray;
    }
}
