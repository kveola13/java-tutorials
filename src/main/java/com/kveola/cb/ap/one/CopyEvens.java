package com.kveola.cb.ap.one;

public class CopyEvens {
    public static int[] copyEvens(int[] nums, int count) {
        int[] returnArray = new int[count];
        int countEvens = 0;
        for (int num : nums) {
            if (countEvens < count) {
                if (num % 2 == 0) {
                    returnArray[countEvens] = num;
                    countEvens++;
                }
            }
        }
        return returnArray;
    }
}
