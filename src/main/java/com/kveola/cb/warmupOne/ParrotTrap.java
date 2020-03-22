package com.kveola.cb.warmupOne;

public class ParrotTrap {
    public static boolean parrotTrouble(boolean talking, int hour) {
        return hour < 7 && talking || hour > 20 && talking;
    }

    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }
}
