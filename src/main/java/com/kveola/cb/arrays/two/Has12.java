package com.kveola.cb.arrays.two;

public class Has12 {
    public static boolean has12(int[] nums) {
        boolean hasOne = false;
        boolean hasTwo = false;
        for (int i : nums) {
            if(i==1) hasOne = true;
            if(i == 2 && hasOne) hasTwo = true;
        }
        return hasTwo;
    }
}
