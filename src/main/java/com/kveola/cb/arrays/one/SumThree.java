package com.kveola.cb.arrays.one;

import java.util.Arrays;

public class SumThree {
    public static int sum3(int[] nums) {
        return Arrays.stream(nums).sum();
    }
}
