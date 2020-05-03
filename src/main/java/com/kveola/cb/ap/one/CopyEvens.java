package com.kveola.cb.ap.one;

public class CopyEvens {
    public static int[] copyEvens(int[] nums, int count) {
        int[] returnArray = new int[count];
        int countEvens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (countEvens < count) {
                if (nums[i] % 2 == 0) {
                    returnArray[countEvens] = nums[i];
                    countEvens++;
                }
            }
        }
        return returnArray;
    }
}
