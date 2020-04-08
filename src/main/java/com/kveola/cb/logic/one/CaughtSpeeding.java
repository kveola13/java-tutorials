package com.kveola.cb.logic.one;

public class CaughtSpeeding {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int acceptableSpeed = 60;
        if (isBirthday) acceptableSpeed += 5;
        int unacceptableSpeed = acceptableSpeed + 20;
        if (speed <= acceptableSpeed) return 0;
        if (speed <= unacceptableSpeed && speed > acceptableSpeed) return 1;
        return 2;
    }
}
