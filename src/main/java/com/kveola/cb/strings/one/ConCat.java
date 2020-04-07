package com.kveola.cb.strings.one;

public class ConCat {
    public static String conCat(String a, String b) {
        if(a.isEmpty() || b.isEmpty()) return a+b;
        if (a.charAt(a.length() - 1) == b.charAt(0)){
            a = a.substring(0, a.length()-1);
        }
        return a + b;
    }
}
