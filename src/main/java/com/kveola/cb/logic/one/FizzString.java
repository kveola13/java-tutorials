package com.kveola.cb.logic.one;

public class FizzString {
    public static String fizzString(String str) {
        String stringToReturn = "";
        if (str.startsWith("f")) stringToReturn += "Fizz";
        if (str.endsWith("b")) stringToReturn += "Buzz";
        if (!str.startsWith("f") && !str.endsWith("b")) return str;
        return stringToReturn;
    }
}
