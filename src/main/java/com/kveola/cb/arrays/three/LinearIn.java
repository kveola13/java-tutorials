package com.kveola.cb.arrays.three;

import java.util.Arrays;

public class LinearIn {
    public static boolean linearIn(int[] outer, int[] inner) {
        int[] temp = new int[inner.length];
        Arrays.fill(temp, Integer.MIN_VALUE);
        for (int i : outer) {
            for (int j = 0; j < inner.length; j++) {
                if(i == inner[j]){
                    temp[j] = inner[j];
                }
            }
        }
        return Arrays.equals(temp, inner);
    }
}
