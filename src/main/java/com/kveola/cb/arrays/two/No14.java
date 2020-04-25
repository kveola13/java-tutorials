package com.kveola.cb.arrays.two;

public class No14 {
    public static boolean no14(int[] nums) {
        boolean containsOne = false;
        boolean containsFour = false;
        for (int i : nums) {
            if (i == 1) containsOne = true;
            if (i == 4) containsFour = true;
        }
        return !containsOne || !containsFour;
    }
}
