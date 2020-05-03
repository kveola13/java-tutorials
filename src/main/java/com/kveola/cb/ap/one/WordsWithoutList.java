package com.kveola.cb.ap.one;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
    public static List wordsWithoutList(String[] words, int len) {
        List<String> list = new ArrayList<>();
        for (String s : words) {
            if(s.length() != len){
                list.add(s);
            }
        }
        return list;
    }
}
