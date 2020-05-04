package com.kveola.cb.ap.one;

public class CopyEndy {
    public static int[] copyEndy(int[] nums, int count) {
        int countEndy = 0;
        int[] returnArray = new int[count];
        for (int i = 0; i < nums.length; i++) {
            if (countEndy < count) {
                if (nums[i] <= 10 && nums[i] >= 0 || nums[i] <= 100 && nums[i] >= 90) {
                    returnArray[countEndy] = nums[i];
                    countEndy++;
                }
            }
        }
        return returnArray;
    }
}
