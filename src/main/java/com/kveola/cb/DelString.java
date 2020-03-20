package com.kveola.cb;

public class DelString {
    public static String delDel(String str) {
        return str.length() > 3 ? str.substring(1, 4).equals("del") ? str.replace("del", "") : str : str;
    }

    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
        System.out.println(delDel("add"));
        System.out.println(delDel("adel"));
    }
}
