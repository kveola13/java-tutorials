package com.kveola.cb.arrays.two;

public class More14 {
    public static boolean more14(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == 1) count++;
            if (i == 4) count--;
        }
        return count > 0;
    }
}
