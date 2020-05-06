package com.kveola.cb.ap.one;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonTwo {
    public static int commonTwo(String[] a, String[] b) {
        int count = 0;
        Set<String> setA = new HashSet<String>(Arrays.asList(a));
        Set<String> setB = new HashSet<String>(Arrays.asList(b));
        for (String s : setA) {
            if (setB.contains(s)) count++;
        }
        return count;
    }
}
