package com.kveola.cb.ap.one;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonTwo {
    public static int commonTwo(String[] a, String[] b) {
        int count = 0;
        Set<String> set = new HashSet<String>();
        set.addAll(Arrays.asList(a));
        set.addAll(Arrays.asList(b));
        for (String s : Math.min(a.length, b.length) == a.length ? a : b) {
            if(set.contains(s)) count++;
        }
        return count;
    }
}
