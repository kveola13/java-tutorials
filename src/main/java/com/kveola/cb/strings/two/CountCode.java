package com.kveola.cb.strings.two;

public class CountCode {
    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) && str.substring(i + 3, i + 4).equals("e")) count++;
        }
        return count;
    }
}
