package com.kveola.basics;

public class CarSelector {
    public static void main(String[] args) {
        //CarSelector carSelector = new CarSelector();
        CarLogging carLogging = new CarLogging();
        for (String argument : args) {
            // new CarLogging().process(argument);
            carLogging.process(argument);
        }
    }
}
