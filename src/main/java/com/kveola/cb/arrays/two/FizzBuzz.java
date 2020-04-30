package com.kveola.cb.arrays.two;


public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        String[] returnArray = new String[end-start];
        int count = 0;
        for (int i = start; i < end; i++) {
            StringBuilder temp = new StringBuilder();
            if(i % 3 == 0) temp.append("Fizz");
            if(i % 5 == 0) temp.append("Buzz");
            if(i % 3 != 0 && i % 5 != 0) temp.append(i);
            returnArray[count] = temp.toString();
            count++;
        }
        return returnArray;
    }
}
