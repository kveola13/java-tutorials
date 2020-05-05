package com.kveola.cb.ap.one;

public class SumHeights {
    public static int sumHeights(int[] heights, int start, int end) {
        int distance = 0;
        for (int i = start; i < end; i++) {
            distance += Math.abs(heights[i+1]-heights[i]);
        }
        return distance;
    }
}
