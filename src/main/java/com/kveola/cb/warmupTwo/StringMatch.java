package com.kveola.cb.warmupTwo;

public class StringMatch {
    public static int stringMatch(String a, String b) {
        int counter = 0;
        int shortestLength = Math.min(a.length(), b.length());
        for (int i = 0; i < shortestLength - 1; i++) {
            if(a.substring(i, i+2).equals(b.substring(i, i+2))){
                counter++;
            }
        }
        return counter;
    }
}
