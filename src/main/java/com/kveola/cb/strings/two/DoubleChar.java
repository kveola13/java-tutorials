package com.kveola.cb.strings.two;

public class DoubleChar {
    public static String doubleChar(String str) {
        StringBuilder stringToReturn = new StringBuilder();
        for (char c : str.toCharArray()) {
            stringToReturn.append(c);
            stringToReturn.append(c);
        }
        return stringToReturn.toString();
    }
}
