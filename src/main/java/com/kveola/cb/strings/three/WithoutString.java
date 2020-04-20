package com.kveola.cb.strings.three;

public class WithoutString {
    public static String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + remove, "");
    }
}
