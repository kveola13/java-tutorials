package com.kveola.cb.arrays;

import java.util.Arrays;

public class BiggerTwo {
    public static int[] biggerTwo(int[] a, int[] b) {
        return Arrays.stream(a).sum() == Arrays.stream(b).sum() ? a : Arrays.stream(a).sum() > Arrays.stream(b).sum() ? a : b;
    }
}
