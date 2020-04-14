package com.kveola.cb.logic.two;

public class NoTeenSum {
    public static int noTeenSum(int a, int b, int c) {
        int noTeen = 0;
        noTeen += fixTeen(a);
        noTeen += fixTeen(b);
        noTeen += fixTeen(c);

        return noTeen;
    }
    public static int fixTeen(int n){
        if(n  <= 12 || n >= 20) return n;
        return n == 15 || n == 16 ? n : 0;
    }
}

