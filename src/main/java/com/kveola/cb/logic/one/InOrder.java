package com.kveola.cb.logic.one;

public class InOrder {
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        return bOk ? b < c : a < b && b < c;
    }
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        boolean equality = a <= b && b<= c;
        boolean largerThan = a < b && b < c;
        return equalOk? equality : largerThan;
    }
}
