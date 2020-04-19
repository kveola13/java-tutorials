package com.kveola.cb.strings.three;

public class CountYZ {
    public static int countYZ(String str) {
        int counter = 0;
        String[] splitString = str.split("[^A-Za-z0-9]");
        for (String s : splitString) {
            if (s.toLowerCase().endsWith("z") || s.toLowerCase().endsWith("y")) counter++;
        }
        return counter;
    }
}
