package com.kveola.cb.strings.one;

public class OutputFormatWord {
    public static String makeOutWord(String out, String word) {
        return String.format("%s%s%s", out.substring(0, out.length() / 2), word, out.substring(out.length() / 2));
    }
}
