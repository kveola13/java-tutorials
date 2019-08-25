package com.kveola.hackerrank.interview;

public class question3 {
    public static void main(String[] args) {

    }

    static void fizzbuzz(int count) {
        for (int i = 1; i < count + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
