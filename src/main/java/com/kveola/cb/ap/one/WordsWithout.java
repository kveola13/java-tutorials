package com.kveola.cb.ap.one;

public class WordsWithout {
    public static String[] wordsWithout(String[] words, String target) {
        int arraySize = 0;
        int count = 0;
        for (String s : words) {
            if (!s.equals(target)) {
                arraySize++;
            }
        }
        String[] array = new String[arraySize];
        for (String s : words) {
            if (!s.equals(target)) {
                array[count] = s;
                count++;
            }
        }
        return array;
    }
}
