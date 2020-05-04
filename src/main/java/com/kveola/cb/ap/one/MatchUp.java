package com.kveola.cb.ap.one;

public class MatchUp {
    public static int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < Math.max(a.length, b.length); i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty()) {
                if (a[i].charAt(0) == b[i].charAt(0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
