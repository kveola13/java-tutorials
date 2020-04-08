package com.kveola.cb.logic.one;

public class AlarmClock {
    public static String alarmClock(int day, boolean vacation) {
        boolean weekday = day <= 5 && day >= 1;
        return vacation && weekday ? "10:00" : vacation ? "off" : weekday ? "7:00" : "10:00";
    }
}
