package com.kveola.cb.ap.one;

public class UserCompare {
    public static int userCompare(String aName, int aId, String bName, int bId) {
        if(aName.equals(bName)){
            return Integer.compare(aId, bId);
        }
        if(aName.compareTo(bName) < 0) {
            return -1;
        }
        return 1;
    }
}
