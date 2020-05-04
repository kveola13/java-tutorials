package com.kveola.cb.ap.one;

public class CopyEndy {
    public static int[] copyEndy(int[] nums, int count) {
        int countEndy = 0;
        int[] returnArray = new int[count];
        for (int num : nums) {
            if (countEndy < count) {
                if (num <= 10 && num >= 0 || num <= 100 && num >= 90) {
                    returnArray[countEndy] = num;
                    countEndy++;
                }
            }
        }
        return returnArray;
    }
}
