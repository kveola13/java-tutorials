package com.kveola.cb.strings.three;

public class MaxBlock {
    public static int maxBlock(String str) {
        int temp = 1;
        int block = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                temp++;
            } else {
                temp = 1;
            }
            if (temp > block) {
                block = temp;
            }
        }
        return block;
    }
}
