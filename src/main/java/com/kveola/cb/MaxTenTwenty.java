package com.kveola.cb;

public class MaxTenTwenty {
    public static int max1020(int a, int b) {
        boolean aInLimit = (a >= 10 && a <= 20);
        boolean bInLimit = (b >= 10 && b <= 20);
        return aInLimit && bInLimit ? Math.max(a,b) : !aInLimit && bInLimit ? b : aInLimit && !bInLimit ? a : 0;
    }
}
