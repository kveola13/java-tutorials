package com.kveola.basics;

public class forLoops {
    public static void main(String[] args) {
        runNormalForLoop();
        runReverseForLoop();
        runOptimalForLoop();
        runNormalForLoopButBetter();
        runReverseForLoopButBetter();
        runPerfectForLoop();
    }

    private static void runNormalForLoop() {
        System.out.println("This is a normal loop");

        for (int i = 0; i < 10; i++) {
            System.out.println("The number i is equal to: " + i);
        }
        System.out.println();
    }

    private static void runReverseForLoop() {
        System.out.println("This is a reversed loop");

        for (int i = 10; i > 0; i--) {
            System.out.println("The number i is equal to: " + i);
        }
        System.out.println();
    }

    private static void runOptimalForLoop() {
        System.out.println("This loop is dependant on a number");

        int maxNumber = 10;
        for (int i = 0; i < maxNumber; i++) {
            System.out.println("The number i will never be more than the max number, which is: " + i);
        }
        System.out.println();
    }
    private static void runNormalForLoopButBetter() {
        System.out.println("This is a normal loop, but the numbers are correct");
        System.out.println("Don't actually fucking start loops with 1, always a 0, but this is just an example");

        for (int i = 1; i < 11; i++) {
            System.out.println("The number i is equal to: " + i);
        }
        System.out.println();
    }
    private static void runReverseForLoopButBetter() {
        System.out.println("This is a normal loop, but with fixed numbers");
        System.out.println("Notice that the number has to be less than or equal to 0");

        for (int i = 10; i >= 0; i--) {
            System.out.println("The number i is equal to: " + i);
        }
        System.out.println();
    }
    private static void runPerfectForLoop() {
        System.out.println("This is a perfect loop");
        System.out.println("Notice how I just add + 1 to the output of i,\nto change the output number, but keep the index");

        int maxNumber = 10;
        for (int i = 0; i < maxNumber; i++) {
            System.out.print("The number i is equal to: ");
            System.out.println( i + 1);
        }
        System.out.println();
    }
}
