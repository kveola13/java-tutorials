package com.kveola.cb.strings.two;


public class ZipZap {
    public static String zipZap(String str) {
        String temp = str;
        StringBuilder stringBuilder = new StringBuilder();
        int j = temp.length();
        int i = 0;
        while (i < j - 2) {
            if (temp.charAt(i) == 'z' && temp.charAt(i + 2) == 'p') {
                stringBuilder.append(temp, 0, i + 1);
                temp = temp.substring(i + 2);
                j = temp.length();
                i = 0;
            }
            i++;
        }
        stringBuilder.append(temp);
        return stringBuilder.toString();
    }
}
