package com.kveola.cb.strings.three;

public class EqualIsNot {
    public static boolean equalIsNot(String str) {
        int isNotCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.startsWith("is", i)) {
                isNotCount++;
                //System.out.printf("%d, here isnotcount increased\n", i);
            }
            if(str.startsWith("not", i)) {
                isNotCount--;
                //System.out.printf("%d, here isnotcount decreased\n", i);
            }
        }
        return isNotCount == 0;
    }
}
