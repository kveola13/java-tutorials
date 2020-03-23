package com.kveola.cb.warmupTwo;

public class DoubleXs {
    static boolean doubleX(String str) {
        int xIndex = str.indexOf('x');
        if (xIndex == -1){
            return false;
        }
        if(xIndex +1 >= str.length()){
            return false;
        }
        return str.substring(xIndex + 1, xIndex +2).equals("x");
    }
    static boolean altDoubleX(String str){
        String xIndex = str.substring(str.indexOf("x"));
        return xIndex.startsWith("xx");
    }
}
