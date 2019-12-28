package com.kveola.basics;

public class CarSelector {
    public static void main(String[] args) {
        //CarSelector carSelector = new CarSelector();
        CarLogging carLogging = new CarLogging();
        for (String argument : args) {
            // new CarLogging().process(argument);
            if (isValid(argument)) {
                carLogging.process(argument);
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
