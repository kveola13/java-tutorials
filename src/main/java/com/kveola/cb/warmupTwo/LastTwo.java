package com.kveola.cb.warmupTwo;

public class LastTwo {
    public static int last2(String str) {
        if (str.length() < 2) return 0;
        String endOfString = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            //System.out.println(sub);
            if (sub.equals(endOfString)) {
                count++;
            }
        }
        return count;
    }
}
