package com.kveola.basics;

import com.kveola.basics.enums.CarState;

public class CarSelector {
    public static void main(String[] args) {
        //CarSelector carSelector = new CarSelector();
        Logging logging = new Logging();
        for (String argument : args) {
            // new CarLogging().process(argument);
            if (isValid(argument)) {
                logging.process(argument);
            } else {
                System.err.println("ignoring invalid argument " + argument);
            }
        }
    }

    private static boolean isValid(String argument) {
        try {
            CarState carState = CarState.valueOf(argument);
        } catch (IllegalArgumentException exception) {
            return false;
        } finally {
            System.out.println("Done with " + argument);
        }
        return true;
    }
}
