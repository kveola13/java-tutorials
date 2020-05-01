package com.kveola.cb.arrays.three;

public class SquareUp {
    public static int[] squareUp(int n) {
        int[] returnArray = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) continue;
                returnArray[i * n + j] = n - j;
            }
        }
        return returnArray;
    }
}
