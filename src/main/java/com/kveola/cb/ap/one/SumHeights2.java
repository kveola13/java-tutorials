package com.kveola.cb.ap.one;

public class SumHeights2 {
    public static int sumHeights2(int[] heights, int start, int end) {
        int distance = 0;
        for (int i = start; i < end; i++) {
            if(heights[i]<heights[i+1]){
                distance += 2 * Math.abs(heights[i+1]-heights[i]);
            }else {
                distance += Math.abs(heights[i+1]-heights[i]);
            }
        }
        return distance;
    }
}
