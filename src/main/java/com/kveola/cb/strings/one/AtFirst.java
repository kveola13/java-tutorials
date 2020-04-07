package com.kveola.cb.strings.one;

public class AtFirst {
    public static String atFirst(String str) {
        int length = str.length();
        if (length > 2) return str.substring(0, 2);
        String replaceWithAts = "@".repeat(2 - length);
        return str + replaceWithAts;
    }

    public static String atFirstAlt(String str) {
        int length = str.length();
        if (length > 2) return str.substring(0, 2);
        int diff = 2 - length;
        StringBuilder replaceWithAts = new StringBuilder();
        for (int i = 0; i < diff; i++) {
            replaceWithAts.append("@");
        }
        return str + replaceWithAts;
    }
}
