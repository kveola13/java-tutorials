package com.kveola.cb.ap.one;

public class UserCompare {
    public static int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) < 0) return -1;
        if (aName.equals(bName) && aId == bId) return 0;
        if(aName.equals(bName) && aId < bId) return -1;
        else {
            return 1;
        }
    }
}
