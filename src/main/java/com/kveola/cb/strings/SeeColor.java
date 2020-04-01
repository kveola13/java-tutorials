package com.kveola.cb.strings;

public class SeeColor {
    public static String seeColor(String str) {
        return str.startsWith("red") ? "red" : str.startsWith("blue") ? "blue" : "";
    }
}
