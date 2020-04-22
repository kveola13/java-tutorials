package com.kveola.cb.strings.three;

public class SumNumbers {
    public static int sumNumbers(String str) {
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder("0");
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            } else {
                sum += Integer.parseInt(stringBuilder.toString());
                stringBuilder = new StringBuilder("0");
            }
        }
        sum += Integer.parseInt(stringBuilder.toString());
        return sum;
    }
}
