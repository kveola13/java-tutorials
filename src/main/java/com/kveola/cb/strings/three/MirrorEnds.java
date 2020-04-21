package com.kveola.cb.strings.three;

public class MirrorEnds {
    public static String mirrorEnds(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1))
                stringBuilder.append(string.charAt(i));
            else
                break;
        }
        return stringBuilder.toString();
    }
}
