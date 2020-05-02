package com.kveola.cb.ap.one;

public class WordsFront {
    public static String[] wordsFront(String[] words, int n) {
        String [] array = new String[n];
        if (n >= 0) System.arraycopy(words, 0, array, 0, n);
        return array;
    }
}
