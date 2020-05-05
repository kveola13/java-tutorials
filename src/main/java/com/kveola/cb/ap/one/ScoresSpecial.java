package com.kveola.cb.ap.one;

public class ScoresSpecial {
    public static int scoresSpecial(int[] a, int[] b) {
        int largestSpecial = 0;
        if (a.length > 0) {
            for (int i : a) {
                for (int j : b) {
                    if ((j + i) % 10 == 0 && (j + i) > largestSpecial) {
                        largestSpecial = j + i;
                    }
                    if (j % 10 == 0 && j > largestSpecial) {
                        largestSpecial = j;
                    }
                    if (i % 10 == 0 && i > largestSpecial) {
                        largestSpecial = i;
                    }
                }
            }
        } else {
            for (int j : b) {
                if (j % 10 == 0 && j > largestSpecial) {
                    largestSpecial = j;
                }
            }
        }
        return largestSpecial;
    }
}
