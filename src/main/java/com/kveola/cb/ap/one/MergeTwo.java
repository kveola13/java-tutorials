package com.kveola.cb.ap.one;

import java.util.*;

public class MergeTwo {
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        Set<String> set = new HashSet();
        set.addAll(Arrays.asList(a));
        set.addAll(Arrays.asList(b));

        List<String> list = new ArrayList(set);

        return list.subList(0, n).toArray(new String[n]);
    }
}
