package com.kveola.cb.logic.one;

public class CigarParty {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return isWeekend ? cigars >= 40 : cigars <= 60 && cigars >= 40;
    }
}
