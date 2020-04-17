package com.kveola.cb.strings.two;

public class XyBalance {
    public static boolean xyBalance(String str) {
        int xCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') xCounter++;
            if (str.charAt(i) == 'y') xCounter = 0;
        }
        return xCounter == 0;
    }
}
