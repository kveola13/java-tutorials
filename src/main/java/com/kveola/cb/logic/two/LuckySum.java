package com.kveola.cb.logic.two;

public class LuckySum {
    public static int luckySum(int a, int b, int c) {
        int luckySum = 0;
        if (a != 13) {
            luckySum += a;
            if (b != 13) {
                luckySum += b;
                if (c != 13) luckySum += c;
            }
        }
        return luckySum;
    }
}
