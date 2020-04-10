package com.kveola.cb.logic.one;

public class FizzString {
    public static String fizzString(String str) {
        String stringToReturn = "";
        if (str.startsWith("f")) stringToReturn += "Fizz";
        if (str.endsWith("b")) stringToReturn += "Buzz";
        if (!str.startsWith("f") && !str.endsWith("b")) return str;
        return stringToReturn;
    }

    public static String fizzString2(int n) {
        String stringToReturn = "";
        if (n % 3 == 0) stringToReturn += "Fizz";
        if (n % 5 == 0) stringToReturn += "Buzz";
        if (n % 3 != 0 && n % 5 != 0) return n + "!";
        return stringToReturn + "!";
    }
}
