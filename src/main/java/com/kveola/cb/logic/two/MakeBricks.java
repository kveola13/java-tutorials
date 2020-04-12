package com.kveola.cb.logic.two;

public class MakeBricks {
    public static boolean makeBricks(int small, int big, int goal) {
        return small + (Math.min(goal/5,big)*5) >= goal;
    }
}
