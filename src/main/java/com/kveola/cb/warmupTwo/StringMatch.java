package com.kveola.cb.warmupTwo;

public class StringMatch {
    public static int stringMatch(String a, String b) {
        int counter = 0;
        for (int i = 0; i < a.length() - 1; i++) {
            for (int j = 0; j < b.length() - 1; j++) {
                if (a.substring(i, i + 2).equals(b.substring(j, j + 2))) {
                    /*System.out.println("A");
                    System.out.println(a.substring(i, i + 2));
                    System.out.println("B");
                    System.out.println(b.substring(j, j + 2));*/
                    counter++;
                }
            }
        }
        return counter;
    }
}
