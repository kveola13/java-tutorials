package com.kveola.cb.strings.three;

public class CountTriple {
    public static int countTriple(String str) {
        int tripleCounter = 0;
        for (int i = 0; i < str.length()-2; i++) {
            System.out.println(str.charAt(i));
            if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) tripleCounter++;
        }
        return tripleCounter;
    }
}
