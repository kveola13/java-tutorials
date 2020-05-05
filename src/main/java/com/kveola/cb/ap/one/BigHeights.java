package com.kveola.cb.ap.one;

public class BigHeights {
    public static int bigHeights(int[] heights, int start, int end) {
        int bigDistance = 0;
        for (int i = start; i < end; i++) {
            if(Math.abs(heights[i+1]-heights[i]) >= 5){
                bigDistance++;
            }
        }
        return bigDistance;
    }
}
