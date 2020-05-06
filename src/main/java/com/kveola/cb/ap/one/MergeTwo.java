package com.kveola.cb.ap.one;

import java.util.Arrays;
import java.util.HashSet;

public class MergeTwo {
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        Arrays.sort(a);
        Arrays.sort(b);
        HashSet<String> finalReturn = new HashSet<>();
        for (String s : a) {
            if (finalReturn.add(s)) {
                finalReturn.add(s);
            }
        }
        for (String s : b) {
            if (finalReturn.add(s)) {
                finalReturn.add(s);
            }
        }
        String [] returnArray = new String[n];
        if (n >= 0) System.arraycopy(finalReturn.toArray(), 0, returnArray, 0, n);
        return returnArray;
    }
}
