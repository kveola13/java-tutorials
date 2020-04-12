package com.kveola.cb.logic.one;

public class ShareDigit {
    public static boolean shareDigit(int a, int b) {
        boolean shareLeft = a % 10 == b % 10;
        boolean shareRight = a % 10 == b / 10;
        boolean shareLeftRight = a / 10 == b / 10;
        boolean shareRightLeft = a / 10 == b % 10;
        return shareLeft || shareRight || shareLeftRight || shareRightLeft;
    }
}
