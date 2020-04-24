package com.kveola.cb.arrays.two;

public class Lucky13 {
    public static boolean lucky13(int[] nums) {
        for (int i : nums) {
            if (i == 1 || i == 3) return false;
        }
        return true;
    }
}
