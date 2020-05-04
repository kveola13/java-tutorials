package com.kveola.cb.ap.one;

public class ScoreUp {
    public static int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            System.out.printf("score: %d, key: %s, answer: %s\n", score, key[i], answers[i]);
            if (!answers[i].equals("?") && !answers[i].equals(key[i])) {
                score-=1;
            }
            if (answers[i].equals(key[i])) {
                score += 4;
            }
        }
        return score;
    }
}
