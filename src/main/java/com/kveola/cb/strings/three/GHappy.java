package com.kveola.cb.strings.three;

public class GHappy {
    public static boolean gHappy(String str) {
        int gCounter = 0;
        int happyGCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                System.out.println("g counter increased at : " + i);
                gCounter++;
                if (i+1 < str.length() && str.charAt(i + 1) == 'g') {
                    System.out.println("happy g counter increased at : " + i);
                    happyGCounter++;
                    i += 2;
                } else if (i - 1 >= 0 && str.charAt(i - 1) == 'g') {
                    System.out.println("happy g counter increased at : " + i);
                    happyGCounter++;
                    i += 1;
                }
            }
        }
        return gCounter == happyGCounter;
    }
}
