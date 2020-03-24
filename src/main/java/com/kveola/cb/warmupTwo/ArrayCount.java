package com.kveola.cb.warmupTwo;


public class ArrayCount {
    public static int arrayCount9(int[] nums){
        int count = 0;
        for (int i: nums) {
            if(i == 9){
                count++;
            }
        }
        return count;
    }
}
