package com.kveola.cb.ap.one;

public class Scores100 {
    public static boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            if(scores[i] == 100 && scores[i+1] == scores[i]) return true;
        }
        return false;
    }
}
