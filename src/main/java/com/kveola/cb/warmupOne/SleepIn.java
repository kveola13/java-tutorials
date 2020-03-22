package com.kveola.cb.warmupOne;

public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
