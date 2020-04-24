package com.kveola.cb.arrays.two;

public class Only14 {
    public static boolean only14(int[] nums) {
        for (int i : nums) {
            if (i != 1 && i != 4) return false;
        }
        return true;
    }
}
