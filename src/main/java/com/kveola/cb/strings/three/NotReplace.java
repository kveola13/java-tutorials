package com.kveola.cb.strings.three;

public class NotReplace {
    public static String notReplace(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))
                    || i + 2 < str.length() && Character.isLetter(str.charAt(i + 2))) {
                stringBuilder.append(str.charAt(i));
            } else if (i + 1 < str.length() && str.startsWith("is", i)) {
                stringBuilder.append("is not");
                i++;
            } else stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
