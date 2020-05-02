package com.kveola.cb.ap.one;

public class WordsCount {
    public static int wordsCount(String[] words, int len) {
        int wordCount = 0;
        for (String s :
                words) {
            if (s.length() == len) wordCount++;
        }
        return wordCount;
    }
}
