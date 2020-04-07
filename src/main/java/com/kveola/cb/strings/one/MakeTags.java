package com.kveola.cb.strings.one;

public class MakeTags {
    public static String makeTags(String tag, String word) {
        return String.format("<%s>%s</%s>", tag, word, tag);
    }
}
