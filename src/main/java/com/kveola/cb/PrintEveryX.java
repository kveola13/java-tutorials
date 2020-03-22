package com.kveola.cb;

public class PrintEveryX {
    public static String everyNth(String str, int n) {
        StringBuilder returnStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(i % n == 0){
                returnStr.append(str.charAt(i));
            }
        }
        return returnStr.toString();
    }
}
