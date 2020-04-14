package com.kveola.cb.logic.two;

public class BlackJack {
    public static int blackjack(int a, int b) {
        if (a <= 21 && b <= 21) {
            return Math.max(a, b);
        } else if (a > 21 && b > 21) {
            return 0;
        }
        return Math.min(a, b);
    }
}
