package com.kveola.hackerrank.interview;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Scanner;

    class MyCalculator {
        int power(int n, int p) throws Exception {
            if(n < 0 || p < 0) {
                throw new Exception("n and p should be non-negative");
            }

            return (p == 0) ? 1 : n*power(n,p-1);
        }
    }
    public class question1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            MyCalculator calculator = new MyCalculator();
            while (scanner.hasNext()){
                int n = scanner.nextInt();
                int p = scanner.nextInt();

                try {
                    System.out.println(calculator.power(n, p));
                } catch (Exception e) {
                    System.out.println("java.lang.Exception: n and p should be non-negative");
                }
            }
        }
    }


