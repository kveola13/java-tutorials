package com.kveola.cb.recursion;

public class BunnyEars {
    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }
}
