package com.kveola.hackerrank.interview;

import java.util.Arrays;

public class question4 {
    private static String[] braces(String[] values) {
        String[] keys = {"{}", "()", "[]"};
        String[] returnValues = new String[values.length];
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if(values.length % 2 != 0){
                returnValues[i] = "NO";
            }
            for (String key: keys) {
                if (key.equals(values[i])) {
                    returnValues[i] = "YES";
                    break;
                }
                returnValues[i] = "NO";
            }
        }
        return returnValues;
    }

    public static void main(String[] args) {
        String[] values = {"{}[]()", "[]", "()"};
        System.out.println(Arrays.toString(braces(values)));
    }
}
