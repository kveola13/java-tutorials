package com.kveola.cb.logic.one;

public class TeaParty {
    public static int teaParty(int tea, int candy) {
        boolean teaCandyGreat = tea >= 2 * candy || candy >= 2 * tea;
        if (tea < 5 || candy < 5) return 0;
        if (teaCandyGreat) return 2;
        return 1;
    }
}
