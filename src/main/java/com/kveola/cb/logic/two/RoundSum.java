package com.kveola.cb.logic.two;

public class RoundSum {
    public static int roundSum(int a, int b, int c) {
        int sum = 0;
        sum += round10(a);
        sum += round10(b);
        sum += round10(c);
        return sum;
    }

    public static int round10(int num) {
        if (num % 10 <= 4) return num / 10 * 10;
        return (num / 10) * 10 + 10;
    }
}
