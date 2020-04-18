package com.kveola.cb.strings.two;

public class GetSandwich {
    public static String getSandwich(String str) {
        int breadCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("bread", i)) breadCount++;
        }
        if (breadCount >= 2) {
            int firstIndexOfBread = str.indexOf("bread");
            int lastIndexOfBread = str.lastIndexOf("bread");
            return str.substring(firstIndexOfBread + 5, lastIndexOfBread);
        }
        return "";
    }

    /* FIXME Attempt at making the breadlogic
    int firstBreadStart = str.indexOf("bread");
            int firstBreadEnd = firstBreadStart + 5;
            String secondBread = str.substring(firstBreadEnd);
            //System.out.printf("FirstBreadStart: %d\nFirstBreadEnd: %d\nSecondBread: %s\nBetweenBread: %s", firstBreadStart, firstBreadEnd, secondBread, betweenBread);
            return secondBread.substring(0, secondBread.indexOf("bread"));
     */
}
