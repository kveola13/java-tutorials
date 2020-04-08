package com.kveola.cb.logic.one;

import org.junit.jupiter.api.Test;

import static com.kveola.cb.logic.one.AlarmClock.alarmClock;
import static org.junit.jupiter.api.Assertions.*;

class AlarmClockTest {

    @Test
    void alarmClockTestOne() {
        assertEquals("7:00", alarmClock(1, false));
    }
    @Test
    void alarmClockTestTwo() {
        assertEquals("7:00", alarmClock(5, false));
    }
    @Test
    void alarmClockTestThree() {
        assertEquals("10:00", alarmClock(0, false));
    }
}