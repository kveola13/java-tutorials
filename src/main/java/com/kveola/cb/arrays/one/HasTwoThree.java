package com.kveola.cb.arrays.one;

public class HasTwoThree {
    public static boolean has23(int[] nums) {
        for (int i: nums) {
            if (i == 2 || i == 3) return true;
        }
        return false;
    }
    public static boolean no23(int[] nums) {
        for (int i: nums) {
            if (i == 2 || i == 3) return false;
        }
        return true;
    }
}
