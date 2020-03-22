package com.kveola.cb.warmupOne;

public class TripleE {
    public static boolean stringE(String str) {
        int counter = 0;
        char[] chaArr = str.toCharArray();
        for (char c: chaArr) {
            if (c == 'e'){
                counter++;
            }
        }
        return counter <= 3 && counter >=1;
    }
}
