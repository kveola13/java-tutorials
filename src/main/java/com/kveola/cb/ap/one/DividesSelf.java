package com.kveola.cb.ap.one;

public class DividesSelf {
    public static boolean dividesSelf(int n) {
        int copy = n;
        if (n % 10 == 0) return false;
        while (n != 0) {
            if (copy % (n % 10) != 0) return false;
            n /= 10;
        }
        return true;
    }
}
