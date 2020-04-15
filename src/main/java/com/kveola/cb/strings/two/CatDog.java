package com.kveola.cb.strings.two;

public class CatDog {
    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("dog", i)) dogCount++;
            if (str.startsWith("cat", i)) catCount++;
        }
        return catCount == dogCount;
    }
}
