package com.kveola.cb.arrays.two;

public class ZeroFront {
    public static int[] zeroFront(int[] nums) {
        int[] returnArray = new int[nums.length];
        int count = 0;
        for (int i : nums) {
            if (i == 0) {
                returnArray[count] = i;
                count++;
            }
        }
        for (int i :nums) {
            if(i != 0){
                returnArray[count] = i;
                count++;
            }
        }
        return returnArray;
    }
}
