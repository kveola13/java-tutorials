package com.kveola.cb.arrays.two;

public class Sum28 {
    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            if (i == 2) sum += 2;
        }
        return sum == 8;
    }
}
