package com.kveola.cb.warmupOne;

public class MixPix {
    public static boolean mixStart(String str) {
        return str.length() > 2 && str.substring(1,3).equals("ix");
    }

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
        System.out.println(mixStart("nix"));
    }
}
