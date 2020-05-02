package com.kveola.cb.ap.one;

public class ScoresAverage {
    public static int scoresAverage(int[] scores) {
        int averageLeft = average(scores, 0, scores.length/2);
        int averageRight = average(scores, scores.length/2, scores.length);
        return Math.max(averageLeft, averageRight);
    }
    private static int average(int[] scores, int start, int end){
        int average = 0;
        for (int i = start; i < end; i++) {
            average += scores[i];
        }
        return average / (end-start);
    }
}
