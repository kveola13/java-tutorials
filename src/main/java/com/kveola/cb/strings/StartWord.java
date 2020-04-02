package com.kveola.cb.strings;

public class StartWord {
    public static String startWord(String str, String word) {
        if (word.length() > str.length()) return "";
        if (str.length() == 0) return "";
        String subStr = str.substring(1);
        String subWord = word.substring(1);
        if (str.startsWith(word)) {
            return str.substring(0, word.length());
        }
        if (subStr.startsWith(subWord)) {
            return str.substring(0, word.length());
        }
        return "";
    }
}
