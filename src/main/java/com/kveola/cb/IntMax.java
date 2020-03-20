package com.kveola.cb;

public class IntMax {
    public static int intMax(int a, int b, int c) {
        return Math.max(a, b) == a ? Math.max(a, c) == a ? a : c : Math.max(b, c) == b ? b : c;
    }

    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
    }
}
