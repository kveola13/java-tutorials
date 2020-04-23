package com.kveola.cb.arrays.two;

public class Sum67 {
    public static int sum67(int[] nums) {
        int sum = 0;
        boolean stopCounting = false;
        for (int i : nums) {
            if (i == 6)
                stopCounting = true;
            if (!stopCounting)
                sum += i;
            if (i == 7 && stopCounting)
                stopCounting = false;
        }
        return sum;
    }
}
