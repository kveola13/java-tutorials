package com.kveola.cb.strings;

public class DeFront {
    public static String deFront(String str) {
        String concat = "";
        if(str.length() < 1) return str;
        if(str.charAt(0) == 'a') concat += str.charAt(0);
        if(str.charAt(1) == 'b') concat += str.charAt(1);
        concat += str.substring(2);
        return concat;
    }
}
