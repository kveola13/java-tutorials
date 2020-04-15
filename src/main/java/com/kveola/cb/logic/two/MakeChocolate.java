package com.kveola.cb.logic.two;

public class MakeChocolate {
    public static int makeChocolate(int small, int big, int goal) {
        int smallGoalDiff = goal - (Math.min(goal/5,big)*5);
        return small + (Math.min(goal/5,big)*5) >= goal ? smallGoalDiff : -1;
    }
}
