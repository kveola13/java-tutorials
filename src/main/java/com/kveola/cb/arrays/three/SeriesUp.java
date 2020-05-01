package com.kveola.cb.arrays.three;

public class SeriesUp {
    public static int[] seriesUp(int n) {
        int count = 0;
        int[] returnArray = new int[n * (n + 1) / 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                returnArray[count] = j;
                count++;
            }
        }
        return returnArray;
    }
}
